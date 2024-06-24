package task_2;
import java.util.Scanner;
public class Pattern {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter a number");
        int n = sc.nextInt(),i,j;
         
        // Loop through each row
        for ( i = 1; i <= n; i++) {
            // Print spaces before the asterisks
            for ( j = 1; j <= n; j++) {
            	{
            		if(i==j || i+j==n+1)
            			System.out.print("*");
            		else
            			System.out.print(" ");
            	}
            }
            // Move to the next line
            System.out.println();
        }
    }
}
