package Entity;

import Type.TimeType;
import Exception.TimeException;

import java.util.Objects;
public class TimeOfAction {
    private static int time;
    private TimeType timeType;


    public void calculateTimeType(TimeType timeType, int time) {
        switch (timeType) {
            case HOUR:
                if (time <= 0 || time > 438000) {
                    throw new TimeException();
                }
                break;
            case DAY:
                if (time <= 0 || time > 18250) {
                    throw new TimeException();
                }
                break;
            case MONTH:
                if (time <= 0 || time > 600) {
                    throw new TimeException();
                }
                break;
            case YEAR:
                if (time <= 0 || time > 50) {
                    throw new TimeException();
                }
                break;
        }
        System.out.println(time + " " + timeType.getName() + " later");
        setTime(time);
        setTimeType(timeType);
    }


    public static int getTime() {
        return time;
    }

    public static void setTime(int time) {
        TimeOfAction.time = time;
    }

    public TimeType getTimeType() {
        return timeType;
    }

    public void setTimeType(TimeType timeType) {
        this.timeType = timeType;
    }

    @Override
    public String toString() {
        return "Time of action{" +
                " time = " + getTime() + " " + getTimeType() +
                " }";
    }

    @Override
    public boolean equals(Object i) {
        TimeOfAction timeOfAction = (TimeOfAction) i;
        return (getTime() == timeOfAction.getTime() && getTimeType() == timeOfAction.getTimeType())
                && (this == i);
    }

    @Override
    public int hashCode() {
        return Objects.hash(getTime(), getTimeType());
    }

}
