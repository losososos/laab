package Entity;

import Type.Place;
import Type.Amount;
import Type.Action;
import Interface.*;
import Type.Thing;


import java.util.Objects;

public abstract class Entity implements Movable, Conditional,Compoundable {

    private final Amount amount;
    private Place place;

    public Entity(Amount amount) {
        this.amount = amount;
    }

    public abstract void move(Place place);

    public Amount getAmount() {

        return amount;
    }

    public Place getPlace() {

        return place;
    }

    public void setPlace(Place place) {

        this.place = place;
    }



    public abstract void compound(Action action,Thing thing);

    public abstract void ifStatement(Action action, Action action2, Thing thing, Thing thing2);

    @Override
    public boolean equals(Object i) {
        Entity entity = (Entity)i;
        return  (getAmount() == entity.getAmount() && getPlace() == entity.getPlace())
                &&(this == i);
    }

    @Override
    public int hashCode() {

        return Objects.hash(getAmount(), getPlace());
    }

    @Override
    public String toString() {
        return "Human{" +
                " amount=" + amount +
                ", place=" + place +
                " }";
    }
}
