package Exception.Account;

public class BalanceInsufficientException extends Exception {
    BalanceInsufficientException(String message){
        super(message);
    }
}
