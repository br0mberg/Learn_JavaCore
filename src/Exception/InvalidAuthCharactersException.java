package Exception;

public class InvalidAuthCharactersException extends Exception{
    String message;

    public InvalidAuthCharactersException(String message) {
        super(message);
        this.message = message;
    }
}
