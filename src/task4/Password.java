package task4;
import java.util.Scanner;

public class Password {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Login Functionality");

        // array initialization
        int[] array = new int[100]; // This creates an array with 100 elements (0 to 99)
        
        
        array[12345 % array.length] = 12345;  // Let's say 12345 is the valid password
        
        System.out.println("Enter the user id");
        int a = sc.nextInt();  // User id input
        
        System.out.println("Enter the password");
        int password = sc.nextInt(); // User id password

        try {
            // Simulate password check by attempting to access the array at index password
            if (array[password % array.length] == password) {
                System.out.println("Login successful");
            } else {
                throw new ArrayIndexOutOfBoundsException("Incorrect password couldn't login");
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Output: " + e.getMessage());
        }

        sc.close();
    }
}
