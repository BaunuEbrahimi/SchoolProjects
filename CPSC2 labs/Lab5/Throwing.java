/*
 * Lab 5: Throwing an Exception
 * Programmer:  Baunu Ebrahimi
 */
import java.util.Scanner;
public class Throwing {
    public static void main(String[] args) {
        try {
            // try to get an integer from the user 
            int x = getInt();
            // if there are no exceptions print the integer
            System.out.println("Entered Value: " + x);
            // if a value is entered that is a non integer catch it
        } catch(IllegalArgumentException e) {
            // print the proper message (IllegalArgumentException message)
            System.out.println(e.getMessage());
        }

    }

    public static int getInt() {
        // create a scanner object
        Scanner scan = new Scanner(System.in);
        // ask the user to enter an integer
        System.out.println("Enter an integer: ");
        // if the entered value is a non integer...
        if(!scan.hasNextInt()) {
            // throw an IllegalArgumentException, showing provided message
            throw new IllegalArgumentException("Value is not an integer.");
        } else {
            // if it is an integer create a variable and initialize it to the value
            int userInt = scan.nextInt();
            // return the value to main to be printed
            return userInt;
        }
    }    
}
