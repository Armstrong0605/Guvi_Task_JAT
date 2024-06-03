package code6;
public class code6 {
    public static void main(String[] args) {
        int num = 5; // The number to be get factorize
        long factorial = 1;

        for (int i = 1; i <= num; ++i) {
            factorial *= i;                // factorization formula
        }

        System.out.printf("Factorial of %d = %d", num, factorial); // To display the result
    }
}

