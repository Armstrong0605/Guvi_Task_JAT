package code4;
// Swapping the numbers
import java.util.Scanner;
public class code4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);// to get input from the user
		System.out.println ("Enter the first number");
		int a= sc.nextInt(); 
		System.out.println ("Enter the Second number");
		int b= sc.nextInt();
        int temp=a; // temporary variable is used to move the value of a 
        a=b; // the value of a is moved to b
        b=temp; // the value of b gets stored in temporary variable
        System.out.println ("The Output of the swapped number is ");
        System.out.println ("The First number is "+a);
        System.out.println ("The second number is "+b);
	}

}
