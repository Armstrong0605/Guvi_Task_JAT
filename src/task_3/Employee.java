package task_3;
public class Employee {
	
	// attributes
	int ID = 456;
	String FirstName= "Jenner";
	static String LastName= "Armstrong";
	int Salary=50000;

	public static void main(String[] args) {
 
		   Employee myObj = new Employee();
		 
		   // To display the employee details
		   
		    System.out.println("Employee ID : " + myObj.ID );
		    System.out.println("FirstName: "    + myObj.FirstName);
		    System.out.println("LastName:"      + myObj.LastName);
		    System.out.println("Name:"          + myObj.FirstName +" "+ LastName);
		    System.out.println("Salary:"        + myObj.Salary); 
		    System.out.println("Annual Salary:" + myObj.Salary*12);
		    System.out.println("Annual Salary Raise Percent :" + myObj.Salary*0.20*12);
		    System.out.println( "Annual Salary:"); 
		    System.out.println( myObj.Salary*12 + myObj.Salary*12*0.20);
		    
		    // Updated Salary Calculations
		    
		double updatedAnnualSalary = myObj.Salary * 12 + myObj.Salary * 12 * 0.20;
	    System.out.println("Employee ID: " + myObj.ID + ", Name: " + myObj.FirstName + " " + LastName + ", Updated Annual Salary: " + updatedAnnualSalary);
	    }
	        
	}
	
	


