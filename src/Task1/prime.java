package Task1;
import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer: "); // displays in output
        int userInput = scanner.nextInt();

        boolean isPrime = userInput > 1;
        for (int i = 2; i <= Math.sqrt(userInput); ++i) { // 
            if (userInput % i == 0) {// number get remainder zero
                isPrime = false;  // not a prime number
                break;
            }
        }

        if (isPrime) {
            System.out.println(userInput + " is a prime number.");
        } else {
            System.out.println(userInput + " is not a prime number.");
        }

        scanner.close();
    }
}

