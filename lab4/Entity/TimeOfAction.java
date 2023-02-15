package Entity;

import Type.TimeType;
import Exception.TimeException;

import java.util.Objects;
public class TimeOfAction {

    public static class TimeManager{
        private static int time;
        private static TimeType timeType;
            public void timeCheck(TimeType timeType, int time){
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
                setTime(time);
                setTimeType(timeType);
            }
    }
    public void timeWriter() {
        System.out.println(TimeManager.time + " " + TimeManager.timeType.getName() + " later");
    }


    public static int getTime() {
        return TimeManager.time;
    }

    public static void setTime(int time) {
        TimeOfAction.TimeManager.time = time;
    }

    public static TimeType getTimeType() {
        return TimeManager.timeType;
    }

    public static void setTimeType(TimeType timeType) {
        TimeManager.timeType = timeType;
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
        return (getTime() == getTime() && getTimeType() == timeOfAction.getTimeType())
                && (this == i);
    }

    @Override
    public int hashCode() {
        return Objects.hash(getTime(), getTimeType());
    }

}
