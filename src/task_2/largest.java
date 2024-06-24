package task_2;
// largest of three numbers
import java.util.Scanner;

public class largest {
	 public static void main(String[] args) {
	        System.out.println("Enter the three number ");
	        Scanner s = new Scanner(System.in);
	        int a,b,c;
	         a = s.nextInt();   // gets three input from the user
	         b = s.nextInt();
	         c = s.nextInt();
             // compares the numbers with else if statement
	         if (a>b && a>c)
	         {
	        	 System.out.println("The value of A is greater");
	         }
	         else if (b>c)
	         {
	        	 System.out.println("The value of B is greater");
	         }
	         else
	         {
	        	 System.out.println ("The value of C is greater");
	         }
}
}