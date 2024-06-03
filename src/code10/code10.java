package code10;

public class code10 {
    public static void main(String[] args) {
        int number = 123456789; // Example number
        int count = 0;

        while (number != 0) {
            number /= 10; // Removes the last digit from the number
            count++; // Increments the count by 1
        }

        System.out.println("Number of digits: " + count);
    }
}
