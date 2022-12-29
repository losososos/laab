package Entity;

import Interface.Actionable;
import Type.*;

public class Anybody extends Korortishka implements Actionable {

    public Anybody() {

        super("Anybody", Amount.ONE);
    }


    @Override
    public String toString() {
        return "Anybody{" +
                "amount=" + getAmount() +
                "place=" + getPlace() +
                "name=" + getName() +
                '}';
    }

    @Override
    public void action(Action action, Thing thing, Place place, Time time) {

    }
}
