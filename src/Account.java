/**
 * Created by siyuk on 1/5/2017.
 */
public class Account {
    // need an account number, password, balance
    // method: return balance
    private int accountNum;
    private String pswd;
    double balance;

    public Account(int accountNum, String pswd, double balance){
        this.accountNum = accountNum;
        this.pswd = pswd;
        this.balance = balance;
    }
}
