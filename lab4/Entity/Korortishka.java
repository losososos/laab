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
        if (thing == Thing.NONE) {
            System.out.print(name + " " + action.getName() + " ");
        } else {
            System.out.print(name + " " + action.getName() + " " + thing.getName() + " ");
        }
    }

    @Override
    public void ifStatement(Action action, Action action2, Thing thing, Thing thing2) {
        System.out.println("If " + name + " " + action.getName() + " " + thing.getName() + " " + name + " " + action2.getName() + " " + thing2.getName());
    }

    public String getName() {

        return name;
    }

    @Override
    public int hashCode() {

        return Objects.hash(getAmount(), getPlace(), getName());
    }

    @Override
    public boolean equals(Object i) {
        Korortishka korotishka = (Korortishka) i;
        return  (getAmount() == korotishka.getAmount() && getPlace() == korotishka.getPlace() && getName() == korotishka.getName())
                &&(this == i);
    }

    @Override
    public String toString() {
        return "Korotishka{" +
                " amount=" + getAmount() +
                ", place=" + place +
                ", name='" + name + '\'' +
                " }";
    }
}
