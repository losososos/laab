package Interface;

import Type.Action;
import Type.Place;
import Type.Thing;
import Type.Time;

public interface Actionable {
    void action(Action action, Thing thing, Place place, Time time);
}
