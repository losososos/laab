package Entity;

import Type.*;

import java.util.Objects;

public abstract class Korortishka extends Entity {
    private final String name;
    private Place place;

    public Korortishka(String name, Amount amount) {
        super(amount);
        this.name = name;
    }


    @Override
    public void move(Place place) {
        setPlace(place);
        System.out.println(name + " move to " + place.getName());
    }


    @Override
    public void compound(Action action, Thing thing) {
        System.out.print(name + " " + action.getName() + " " + thing.getName() + " ");
    }

    @Override
    public void ifStatement(Action action, Action action2, Thing thing, Thing thing2) {
        System.out.println("If " + name + " " + action.getName() + " " + thing.getName() + " " + name + " " + action2.getName() + " " + thing2.getName());
    }

    public String getName() {

        return name;
    }

    @Override
    public boolean equals(Object i) {
        if (this == i) return true;
        if (!(i instanceof Korortishka korotishka)) return false;
        if (!super.equals(i)) return false;
        return Objects.equals(getName(), korotishka.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getName());
    }

    @Override
    public String toString() {
        return "Korotishka{" +
                "amount=" + getAmount() +
                "name='" + name + '\'' +
                '}';
    }
}
