package Entity;

import Exception.AmountException;
import Interface.Actionable;
import Type.*;
import Type.GroupTypes;

import java.util.Objects;

public class Group extends Entity implements Actionable {

    private final GroupTypes grouptype;

    public Group(Amount amount, GroupTypes grouptype) throws AmountException {
        super(amount);
        this.grouptype = grouptype;

        if (grouptype.getName().equals("korotishki") && amount.getName().equals("two")) {
            throw new AmountException();
        } else if (grouptype.getName().equals("Vintik and Shpuntik") && amount.getName().equals("many")) {
            throw new AmountException();
        }
    }

    public GroupTypes getGroup() {
        return grouptype;
    }

    @Override
    public void action(Action action, Thing thing, Place place, Time time) {
        switch (action) {
            case SEE:
                System.out.println(grouptype.getName() + " " + action.getName() + " " + thing.getName() + " " + place.getName());
                break;
            case READ:
                System.out.println(grouptype.getName() + " " + action.getName() + " " + thing.getName());
                break;
            case NEED:
                System.out.println(grouptype.getName() + " " + action.getName() + " " + thing.getName());
                break;
        }
    }

    @Override
    public void move(Place place) {
        setPlace(place);
        System.out.println(grouptype.getName() + " move to " + place.getName());
    }


    @Override
    public void compound(Action action, Thing thing) {
        if (thing == Thing.NONE) {
            System.out.print(grouptype.getName() + " " + action.getName() + " ");
        } else {
            System.out.print(grouptype.getName() + " " + action.getName() + " " + thing.getName() + " ");
        }
    }

    @Override
    public void ifStatement(Action action, Action action2, Thing thing, Thing thing2) {
        System.out.println("If " + grouptype.getName() + " " + action.getName() + " " + thing.getName() + " " + grouptype.getName() + " " + action2.getName() + " " + thing2.getName());
    }

    @Override
    public String toString() {
        if (grouptype== GroupTypes.KOROTISHKI) {
            return "Korotishki{" +
                    " amount=" + getAmount() +
                    ", place=" + getPlace() +
                    ", grouptype=" + grouptype +
                    " }";
        }
        else{
            return "Vintik and Shpuntik{" +
                    " amount=" + getAmount() +
                    ", place=" + getPlace() +
                    ", grouptype=" + grouptype +
                    " }";
        }
    }
}