/**
 * Created by benjaminmacmillan1 on 1/5/17.
 */
import java.util.*;

public class Bank {
    public void transfer(Account giver, Account receiver, double amount) {
        Scanner s = new Scanner(System.in);
        System.out.println("Password for giver:");
        String password = s.next();

        if (password.equals(giver.password())) {
            if (giver.balance > amount) {
                giver.balance -= amount;
                receiver.balance += amount;
            } else {
                System.out.println("Not enough funds in account");
            }
        }
    }
}
