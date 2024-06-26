package Task5;
import java.util.ArrayList;
import java.util.List;

public class listtoarray {
	
	 
	    public static void main(String[] args) {
	        // Create a List
	        List<String> list = new ArrayList<>();
	        list.add("Apple");
	        list.add("Banana");
	        list.add("Cherry");
	        list.add("Date");

	        // Convert the List to an array
	        String[] array = list.toArray(new String[0]);

	        // Print the array
	        System.out.println("Array elements:");
	        for (String element : array) {
	            System.out.print (element +" ");
	        }
	    
	}


}
