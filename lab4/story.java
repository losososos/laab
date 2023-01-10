import Entity.*;
import Type.*;
import Exception.*;

public class story {
    public static void main(String[] args) {
        Group korotishki;
        Group boltiki;
        try {
            korotishki = new Group(Amount.MANY, GroupTypes.KOROTISHKI);
            boltiki = new Group(Amount.TWO, GroupTypes.BOLTIKI);
        } catch (AmountException e) {
            throw new RuntimeException(e);
        }
        Znaika znaika = new Znaika();
        Anybody anybody = new Anybody();
        Things dreams = new Things(new Object[]{Thing.ROCKET, Thing.MOON, Thing.MOONGUYS, Thing.OTHER});
        Telegram telegram = new Telegram(Thing.WRITTEN3);
        TimeOfAction timeManager = new TimeOfAction();


        znaika.compound(Action.DREAM, Thing.SO);
        znaika.compound(Action.SKIP, Thing.NONE);
        znaika.action(Action.SLEEP, Thing.NONE, Place.NONE, Time.NONE);
        znaika.compound(Action.DREAM, Thing.ABOUT);

        dreams.thingsOut();

        znaika.action(Action.DISAPPEAR, Thing.NONE, Place.NONE, Time.INTHEMORNING);
        znaika.action(Action.SKIP, Thing.NONE, Place.BREAKFAST, Time.NONE);
        korotishki.move(Place.ROOM);
        korotishki.action(Action.SEE, Thing.NOTE, Place.TABLE, Time.NONE);
        korotishki.action(Action.READ, Thing.WRITTEN, Place.NONE, Time.NONE);
        korotishki.compound(Action.UNDERSTAND, Thing.THAT);
        znaika.move(Place.SUNCITY);
        znaika.ifStatement(Action.DECIDE, Action.COMPLETE, Thing.SMTH, Thing.IT);
        znaika.action(Action.WAKEUP, Thing.NONE, Place.NONE, Time.EARLY);
        znaika.compound(Action.DECIDE, Thing.NONE);
        znaika.move(Place.SUNCITY);
        znaika.action(Action.WRITE, Thing.NOTE, Place.NONE, Time.NONE);
        znaika.action(Action.LEAVE, Thing.NONE, Place.HOME, Time.NONE);
        anybody.ifStatement(Action.WRITE, Action.WRITE, Thing.NOTE, Thing.WRITTEN2);
        znaika.compound(Action.KNOW, Thing.WRITTEN);
        anybody.compound(Action.UNDERSTAND, Thing.NONE);
        znaika.move(Place.SUNCITY);

        timeManager.calculateTimeType(TimeType.MONTH, 2);

        znaika.action(Action.SEND, Thing.TELEGRAM, Place.NONE, Time.NONE);

        telegram.telegramOut();

        boltiki.compound(Action.UNDERSTAND, Thing.WHAT);
        boltiki.action(Action.NEED, Thing.TODO, Place.NONE, Time.NONE);
        boltiki.action(Action.PACK, Thing.NONE, Place.NONE, Time.INSTANTLY);
        boltiki.move(Place.SUNCITY);
    }
}