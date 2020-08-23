package bankaccountexample;

import java.util.ArrayList;

public class Person {
    private String name;
    private ArrayList<Account> accounts;

    public Person(String name) {
        this.name = name;
        this.accounts = new ArrayList<Account>();
    }

    public void addAccount(Account account) {
        this.accounts.add(account);
    }

    public int moneyTotal() {
        int total =0;
        for (Account account: this.accounts) {
            total += account.getBalanceAsCents();
        }
        return total;
    }
}
