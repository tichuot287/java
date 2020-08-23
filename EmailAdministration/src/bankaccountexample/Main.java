package bankaccountexample;

public class Main {
    public static void main (String[] args) {
        Person matti = new Person("Matti");
        Person maija = new Person("Maija");

        Account salaryAccount = new Account("NORD-LOL");
        Account householdAccount = new Account("SAM-LOL");

        matti.addAccount(salaryAccount);
        matti.addAccount(householdAccount);
        maija.addAccount(householdAccount);

        System.out.println("Money on Matti's accounts: " + matti.moneyTotal());
        System.out.println("Money on Maija's accounts: " + maija.moneyTotal());
        System.out.println();

        salaryAccount.deposit(150000);

        System.out.println("Money on Matti's accounts: " + matti.moneyTotal());
        System.out.println("Money on Maija's accounts: " + maija.moneyTotal());
        System.out.println();

        householdAccount.deposit(10000);
        System.out.println("Money on Matti's accounts: " + matti.moneyTotal());
        System.out.println("Money on Maija's accounts: " + maija.moneyTotal());
        System.out.println();



    }

}
