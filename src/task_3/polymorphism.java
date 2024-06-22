package task_3;

public class polymorphism {

//	public class Main 
	
	    public static void main(String[] args) {
	        // Create an array of Tea objects, including instances of subclasses
	        Tea[] teas = new Tea[] {
	            new Tea(),
	            new GreenTea(),
	            new HerbalTea(),
	            new BlackTea()
	        };

	        // Iterate through the array and prepare each type of tea
	        for (Tea tea : teas) {
	            tea.prepareTea();
	            System.out.println();
	        }
	    }
	}


