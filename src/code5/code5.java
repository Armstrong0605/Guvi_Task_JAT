package code5; // program to find wheather given number number is prime or not
import java.util.Scanner;

public class code5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in); // used to get input from user
        System.out.print("Enter a number: "); // displays in output
        int num = s.nextInt();

        if (isPrime(num)) { 
            System.out.println(num + " is a prime number");
        } else {
            System.out.println(num + " is not a prime number");
        }
    }
 // formula to check wheather prime or not
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}


