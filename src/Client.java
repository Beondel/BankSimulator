/**
 * Created by benjaminmacmillan1 on 1/5/17.
 */
import java.util.*;

public class Client {
    // the interface of all the transaction
    public static void main (String[] args) {
        System.out.println("Welcome to Bank of Kittens! What can I do for you today?");
        Bank kittenBank = new Bank();
        Scanner accountHolder = new Scanner(System.in);
        String answer = accountHolder.next();
        String password = newAccount(accountHolder);

        Account account1 = new Account(000001, "password123", 250000.00);
        Account account2 = new Account(000002, password, 35.00);

        System.out.println("giver account balance: " + account1.balance);
        System.out.println("receiver account balance: " + account2.balance);

        System.out.println("How much should we transfer to your new account?");
        double amountTransferred = accountHolder.nextDouble();
        kittenBank.transfer(account1, account2, amountTransferred);

        System.out.println("giver account balance: " + account1.balance);
        System.out.println("receiver account balance: " + account2.balance);
    }

    public static String newAccount(Scanner s) {
        for(;;) {
            System.out.println("Password for new account:");
            String password = s.next();
            System.out.println("Confirm:");
            String password2 = s.next();

            if (password.equals(password2)) {
                return password;
            } else {
                System.out.println("Please make sure your passwords match!");
            }
        }
    }
}
