package Entity;

import Interface.Actionable;
import Type.*;

public class Group extends Korortishka implements Actionable {

    public Group() {

        super("Korotishki", Amount.MANY);
    }

    @Override
    public void action(Action action, Thing thing, Place place, Time time) {
        switch (action) {
            case SEE:
                System.out.println(this.getName() + " " + action.getName() + " " + thing.getName() + " " + place.getName());
                break;
            case READ:
                System.out.println(this.getName()+ " "+ action.getName() + " " + thing.getName());
                break;
        }
    }

    @Override
    public String toString() {
        return "Korotishki{" +
                "amount=" + getAmount() +
                "place=" + getPlace() +
                "name=" + getName() +
                '}';
    }
}