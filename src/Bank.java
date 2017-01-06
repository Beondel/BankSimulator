/**
 * Created by benjaminmacmillan1 on 1/5/17.
 */
public class Bank {
    public void transfer(Account giver, Account receiver, double amount) {
        if (giver.balance > amount) {
            giver.balance -= amount;
            receiver.balance += amount;
        } else {
            System.out.println("Not enough funds in account");
        }
    }
}
