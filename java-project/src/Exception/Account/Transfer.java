package Exception.Account;

public class Transfer {
    public static void main(String[] args) {
        Account account1 = new Account();
        Account account2 = new Account();
        long money1 = account1.getBalance();
        long money2 = account2.getBalance();

        try {
            account1.withdraw(5000);
            account2.deposit(5000);
        } catch (BalanceInsufficientException e) {
            account1.setBalance(money1);
            account2.setBalance(money2);
        }
    }
}
