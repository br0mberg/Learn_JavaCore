package Exception;

public class PasswordAuthConfirmationException extends Exception{
    String message;

    public PasswordAuthConfirmationException(String message) {
        super(message);
        this.message = message;
    }
}
