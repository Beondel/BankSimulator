/**
 * Created by benjaminmacmillan1 on 1/5/17.
 */
public class Client {
    // the interface of all the transaction
    public static void main (String[] args){
        System.out.println("Welcome to Bank of Kittens! WHat can I do for you today?");
        Bank kittenBank = new Bank();

        Account account1 = new Account(000001, "password123", 250000.00);
        Account account2 = new Account(000002, "password12345", 35.00);

        System.out.println("giver account balance: " + account1.balance);
        System.out.println("recevier account balance: " + account2.balance);

        kittenBank.transfer(account1, account2, 300000.00);

        System.out.println("giver account balance: " + account1.balance);
        System.out.println("receiver account balance: " + account2.balance);
    }
}
