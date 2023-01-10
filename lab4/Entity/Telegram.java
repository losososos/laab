package Entity;

import Type.Thing;

import java.util.Objects;

public class Telegram {
    private Thing thing;

    public Telegram(Thing thing) {
        this.thing = thing;
    }
    public void telegramOut() {
        System.out.println("Telegram text: " + thing.getName());
    }


    @Override
    public String toString() {
        return "Telegram{" +
                " thing = " +  thing.getName() +

                " }";
    }
    @Override
    public boolean equals(Object i) {
        Telegram telegram = (Telegram) i;
        return  (thing.getName() == telegram.thing.getName())
                &&(this == i);
    }

    @Override
    public int hashCode() {

        return Objects.hash(thing.getName());
    }
}
