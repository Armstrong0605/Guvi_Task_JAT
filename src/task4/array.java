package task4;

import java.util.Scanner;

public class array 
    {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int[] array = {0, 1, 2, 3, 4}; // array values
        
        System.out.println("Enter an index to access the array:");
        int index = sc.nextInt();
        
        try 
        {
            int value = array[index]; // This may throw ArrayIndexOutOfBoundsException
            System.out.println("The value at index " + index + " is: " + value);
        } 
        catch (ArrayIndexOutOfBoundsException e) 
        {
            System.out.println("Array index out of bounds: " + e.getMessage());
        }
       
        System.out.println("Enter a string:");
        String str = sc.next();
        
        System.out.println("Enter an index to access the string:");
        int strIndex = sc.nextInt();
        
        try 
        {
            char ch = str.charAt(strIndex); // This may throw StringIndexOutOfBoundsException
            System.out.println("The character at index " + strIndex + " is: " + ch);
        } 
        catch (StringIndexOutOfBoundsException e) 
        {
            System.out.println("String index out of bounds: " + e.getMessage());
        }
        
        sc.close();
    }
}


