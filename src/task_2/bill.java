package task_2;
import java.util.Scanner;

public class bill {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the month in number: ");
        int a = scanner.nextInt();

        System.out.print("Rent per day: ");
        float b = scanner.nextFloat();

        System.out.print("No of days stayed in the hotel: ");
        int c = scanner.nextInt();

        // to calculate the total bill amount
        float d = b * c;

        // Modify the bill amount based on the month (a)
        switch (a) {
            case 4:
            case 5:
            case 6:    
            case 11:
            case 12:
            	  d *= 1.2; // increase by 20% if the input is 4,5,6,11,12
                break;
            case 1:
            case 2:
            case 3:
            case 7:
            case 8:
            case 9:
            case 10:          // do not increase the amount 
            break;
            default:
                System.out.println("Invalid month input.");
                return;
        }

        System.out.println("The total bill amount is: " + d);
    }
}
