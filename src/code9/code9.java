package code9;
import java.util.Scanner;
public class code9 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in); // used to get input from user
        System.out.print("Enter the person age: "); // displays in output
        int age = s.nextInt();
        int i=0;
        if (age>=60) 
        {
        	System.out.print("The person is senior citizen");
        }
        else
        {
        	System.out.print("The person is not a senior citizen");
        }
	}

}
