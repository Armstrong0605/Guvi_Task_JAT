package task_2;
public class Palindrome {
    public static void main(String[] args) {
        String word = "MALAYALAM";    // palindrome word
        String word2 = "";

        for (int i = word.length() - 1; i >= 0; i--) {      // using for loop decrementing the length of the words
            word2 += word.charAt(i); 
        }

        System.out.println(word2);

        if (word2.equals(word)) {                               // to check if the reversed words and the given word is equal or not 
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a palindrome");
        }
    }
}

