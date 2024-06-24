package task_2;
// Program to find the grades of the student studying in ANNA UNIVERSITY
import java.util.Scanner;

public class grade {
    public static void main(String[] args) {
        System.out.println("ANNA UNIVERSITY GRADING SYSTEM :-");
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the mark scored by student:");
        int a = s.nextInt();

        if (a == 100) {                  // else if ladder is used to check the different grades of the program
            System.out.println("Your grade is S");
        } else if (a >= 90) {
            System.out.println("Your grade is A");
        } else if (a >= 80) {
            System.out.println("Your grade is B");
        } else if (a >= 70) {
            System.out.println("Your grade is C");
        } else if (a >= 60) {
            System.out.println("Your grade is D");
        } else if (a >= 50) {
            System.out.println("Your grade is E");
        } else if (a >= 0) {
            System.out.println("Your grade is F");
        } else {
            System.out.println("Please enter valid marks");
        }
    }
}
