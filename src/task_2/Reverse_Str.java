package task_2;
import java.util.Scanner ;
public class Reverse_Str {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in); // used to get input from user
        System.out.print("Enter the word to get reversed: ");
        String word = s.next();   // stores the variable given as input
        String word2 = "";
       
        for (int i = word.length() - 1; i >= 0; i--) {      // using for loop decrementing the length of the words
            word2 += word.charAt(i); 
            System.out.println(word2);    // to display the reversed word
        }

	}
}
