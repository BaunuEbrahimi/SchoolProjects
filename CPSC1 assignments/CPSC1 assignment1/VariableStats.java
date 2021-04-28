import java.util.Scanner; 
import java.lang.StringBuilder;

public class VariableStats {
    // define transpose function
    public static String transpose(String name) {
        // found first half of inputed string
        String firstHalf = name.substring(0, name.length() / 2);
        // found second half of inputed string
        String secondHalf = name.substring(name.length() / 2, name.length());
        // return the concatenation of transposed string
        return secondHalf + firstHalf;
    }

    public static void main(String[] args) {
        // initialize scanner
        Scanner scan = new Scanner(System.in);
        // asking the user for a string
        System.out.println("Please input a string:");
        // Wasn't sure whether whole line or just next word
        // String name = scan.next();
        String name = scan.nextLine();
        // finding the first character of the string
        char firstChar = name.charAt(0);
        // finding the length of the string
        int nameLength = name.length();
        // finding the last character of the string
        char lastChar = name.charAt(nameLength - 1);
        // finding the middle character of the string
        char middleChar = name.charAt(nameLength / 2);
        // capitalizing the entire string
        String upperCase = name.toUpperCase();
    
        System.out.println("String length is: " + nameLength); 
        System.out.println("First char is: " + firstChar);
        System.out.println("Last char is: " + lastChar);
        System.out.println("Middle char at position " + nameLength / 2 + " is: " + middleChar);
        System.out.println("Transpose: " + transpose(name));
        System.out.println("Uppercase: " + upperCase); 
    }
}