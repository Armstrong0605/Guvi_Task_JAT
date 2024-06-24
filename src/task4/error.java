package task4;
import java.util.Scanner;
public class error {
	public static void main(String args[]) {
		
	Scanner sc= new Scanner(System.in);

	// To display and get the values from the user
	System.out.println("Enter the value of a:");
	   int a= sc.nextInt();
	System.out.println("Enter the value of b:");
	   int b = sc.nextInt();
	   
   // To display error the user input of b is zero
    try {
    	if (b>1)
    	{
    		System.out.println(a/b);
    	}
    	else 
    	{
    		throw new IndexOutOfBoundsException("Error");	
    	}
    }
    	catch (IndexOutOfBoundsException e)
    	{
    		 System.out.println("Output: " + e.getMessage());
    	}
    
    sc.close();
}
}