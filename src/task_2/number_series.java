package task_2;
import java.util.Scanner;                     

public class number_series {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);      // to get user input
        System.out.print("Enter the input: ");   // to display output
        int a = s.nextInt();

        int num = 1;
        for (int i = 1; i <= a; i++) {                       // get increment upto the user input value
            for (int j = 1; j <= i; j++) {                   // increment the value
                System.out.print(num + " ");                 // to display the output
                num++;
            }
            System.out.println();
        }
    }
}
