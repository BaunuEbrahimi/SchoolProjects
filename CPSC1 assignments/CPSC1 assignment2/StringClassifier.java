import java.util.Scanner;
import java.lang.StringBuilder; 

public class StringClassifier {
    // check if the string is repeated, firsthalf of the string equals the second half
    static boolean isRepeated(String input) {

        String firstHalf = input.substring(0, input.length() / 2);
        String secondHalf = input.substring(input.length() / 2, input.length());
        return firstHalf.equals(secondHalf);   
    }
    // reverse the string input
    static String reverse(String input) {
        StringBuilder strBuilder = new StringBuilder(input);
        return strBuilder.reverse().toString();
    }
    // check if the string is a palindrome, is the reversed string equal to the input
    static boolean isPalindrome(String input) {
        return input.equals(reverse(input));
    }
    public static void main(String[] args) {
        // initialize scanner
        System.out.println("Welcome to the String Classifier program");
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a string: ");
       // declare input 
        String input = scan.next();
        if (isRepeated(input)) {
             // tell user if their string is repeated 
            System.out.printf("%s is repeated", input);
        } else if (isPalindrome(input)) {
             // tell user if their string is a palindrome 
            System.out.printf("%s is a palindrome", input);
        } else {
            // tell user if their string is neither or not special
             System.out.printf("There is nothing special about string %s", input );
        }
    }
}
    