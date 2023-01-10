package Exception;

public class TimeException extends RuntimeException{
    public TimeException() {
        super("Wrong amount of time");
    }
}
