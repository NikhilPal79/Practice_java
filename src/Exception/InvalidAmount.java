package Exception;

public class InvalidAmount extends RuntimeException{

    public InvalidAmount(String message) {
        super(message);
    }
}
