package task4;
import java.util.Scanner;
public class age 
    {
    public static void main(String args[])
    {
	Scanner sc = new Scanner (System.in); 
	System.out.println("Enter your age to proceed");
	int age = sc.nextInt(); // to get age from the user
	
	try
	{   // to check the age is above 18
		if (age>18)    
		{
		System.out.println("You can Proceed");	
		}
		else
		{
			 throw new IndexOutOfBoundsException("Invalid Age exception");
        }
    } 
	 catch (IndexOutOfBoundsException e)
	{
        System.out.println("Output: " + e.getMessage());
        sc.close();
    }
	}
    }
