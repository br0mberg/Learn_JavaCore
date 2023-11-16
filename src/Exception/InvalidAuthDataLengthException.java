package Exception;

public class InvalidAuthDataLengthException extends Exception {
    String message;

    public InvalidAuthDataLengthException(String message) {
        super(message);
        this.message = message;
    }
}
