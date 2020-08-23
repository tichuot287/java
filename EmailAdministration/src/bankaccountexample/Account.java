package bankaccountexample;

public class Account {
    // object variables
    private String accountID;
    private int balanceAsCents;
    // constructor of class
    public Account(String accountID) {
        this.accountID = accountID;
        this.balanceAsCents = 0;
    }
    // deposit method
    public void deposit(int sum) {
        this.balanceAsCents += sum;
    }
    // show balance in user account
    public int getBalanceAsCents() {
        return this.balanceAsCents;
    }

}
