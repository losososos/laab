package Entity;

import Interface.Actionable;
import Type.*;

public class Znaika extends Korortishka implements Actionable {

    public Znaika() {

        super("Znaika", Amount.ONE);
    }

    @Override
    public void action(Action action, Thing thing, Place place, Time time) {
        switch (action) {
            case WRITE:
                System.out.println(this.getName() + " " + action.getName() + " " + thing.getName());
                break;
            case WAKEUP:
            case DISAPPEAR:
                System.out.println(this.getName() + " " + action.getName() + " " + time.getName());
                break;
            case LEAVE:
            case SKIP:
                System.out.println(this.getName() + " " + action.getName() + " " + place.getName());
                break;
            case SLEEP:
                System.out.println(this.getName() + " " + action.getName());
                break;
            case SEND:
                System.out.println(this.getName() + " " + action.getName() + " " + thing.getName() + " " + time.getName());
                break;
        }
    }


    @Override
    public String toString() {
        return "Znaika{" +
                " amount=" + getAmount() +
                ", place=" + getPlace() +
                ", name=" + getName() +
                " }";
    }

}
