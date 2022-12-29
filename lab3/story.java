import Entity.*;
import Type.*;

public class story {
    public static void main(String[] args) {
        Znaika znaika = new Znaika();
        Group korotishki = new Group();
        Anybody anybody = new Anybody();

        znaika.action(Action.DISAPPEAR, Thing.NONE, Place.NONE, Time.INTHEMORNING);
        znaika.action(Action.SKIP, Thing.NONE, Place.BREAKFAST, Time.NONE);
        korotishki.move(Place.ROOM);
        korotishki.action(Action.SEE, Thing.NOTE, Place.TABLE, Time.NONE);
        korotishki.action(Action.READ, Thing.WRITTEN, Place.NONE, Time.NONE);
        korotishki.compound(Action.UNDERSTAND,Thing.NONE);
        znaika.move(Place.SUNCITY);
        znaika.ifStatement(Action.DECIDE,Action.COMPLETE,Thing.SMTH,Thing.IT);
        znaika.action(Action.WAKEUP,Thing.NONE,Place.NONE,Time.EARLY);
        znaika.compound(Action.DECIDE,Thing.NONE);
        znaika.move(Place.SUNCITY);
        znaika.action(Action.WRITE,Thing.NOTE,Place.NONE,Time.NONE);
        znaika.action(Action.LEAVE,Thing.NONE,Place.HOME,Time.NONE);
        anybody.ifStatement(Action.WRITE,Action.WRITE,Thing.NOTE,Thing.WRITTEN2);
        znaika.compound(Action.KNOW, Thing.WRITTEN);
        anybody.compound(Action.UNDERSTAND,Thing.NONE);
        znaika.move(Place.SUNCITY);
    }
}