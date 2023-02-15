package Exception;

public class TimeException extends RuntimeException{
    public TimeException() {
        super("Too much time has passed");
    }
}
