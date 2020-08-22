package emailapp;

import java.util.Scanner;

public class EmailApp {
    public static void main(String[] args) {
        Scanner name = new Scanner(System.in);
        System.out.print("First name: ");
        String firstName = name.nextLine();
        System.out.print("Last name: ");
        String lastName = name.nextLine();
        Email em1 = new Email(firstName,lastName);
        System.out.println(em1.showInfo());
    }
}
