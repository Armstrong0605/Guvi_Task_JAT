package Task5;
 
import java.util.ArrayList;

public class Array {

	public static void main (String[] args)
	{
		ArrayList<String> list=new ArrayList<String>();
		
		list.add("Jenner");
		list.add("Armstrong");
		list.add("Mohan");
		list.add("Albert");
		
		for (String ls : list)
		{
			System.out.println(ls);	
		}
		
		list.clear();
		System.out.println("The cleared list size is " + list.size());
	
	}
}
