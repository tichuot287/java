package studentdatabaseapp;

import java.util.Scanner;

public class StudentDatabaseApp {
    public static void main(String[] args){
        // input number of students
        System.out.println("Enter number of new students to enroll: ");
        Scanner in = new Scanner(System.in);
        int numberOfStudents = in.nextInt();
        Student[] students = new Student[numberOfStudents];

        //Create a number of students
        for (int n =0; n < numberOfStudents; n++){
            students[n] = new Student();
            students[n].enroll();
            students[n].payTuition();
        }

        for (int n = 0; n < numberOfStudents; n++){
            System.out.print(students[n].toString());
        }
    }
}
