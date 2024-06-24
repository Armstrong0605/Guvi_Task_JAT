package task4;
import java.io.File;        // import the text file
import java.io.FileNotFoundException;  // To handle when specified file is not found
import java.util.Scanner;


public class Filenotfound {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the password");
		int password = sc.nextInt();
		 String filename="Untitled 1.txt";            // Declare the text file
		 
		 // Check weather the password matches the file
		 
		 try (Scanner fileScanner = new Scanner(new File(filename))) {
	            boolean loginSuccess = false;
	            while (fileScanner.hasNextLine()) {
	                int filePassword = Integer.parseInt(fileScanner.nextLine().trim());
	                if (filePassword == password) 
	                {
	                   loginSuccess = true;
	                    break;
	                }
	            }
	            System.out.println(loginSuccess ? "Login successful" : "Incorrect password");
	        } 
	       catch (FileNotFoundException e)
	        {
	            System.out.println("Error: Password file not found");
	        }

	}
	
}
