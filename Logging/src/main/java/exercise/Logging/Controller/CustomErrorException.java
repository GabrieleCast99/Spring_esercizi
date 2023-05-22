package exercise.Logging.Controller;

public class CustomErrorException extends RuntimeException {
    public CustomErrorException(String message) {
        super(message);
    }
}