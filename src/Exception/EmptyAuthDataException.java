package Exception;

public class EmptyAuthDataException extends Exception {
    String message;

    public EmptyAuthDataException(String message) {
        super(message);
        this.message = message;
    }
}
