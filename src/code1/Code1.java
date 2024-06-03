package code1;
// To declare four variables. The sum of a and b must greater than c and d. Use if statements to compare the values 
public class Code1 {

	public static void main(String[] args) {
		int a,b,c,d,z,y;   // declaring the variables
		a= 40;
	    b= 20;
	    c= 15;
	    d= 19;
	    z = a+b;
	    y=  c+d;
	    if (z>y)           // using the if statement to compare the two numbers
	    {
	    	System.out.println ("The sum of a+b is greater than c+d");
	    }
        if (z<y)
        {
        	System.out.println ("The sum of c+d is greater than a+b");
        }
	}

}
