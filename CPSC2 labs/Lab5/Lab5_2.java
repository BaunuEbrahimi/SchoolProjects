/*
 * Lab 5: Catching Exceptions
 * Programmer:  Baunu Ebrahimi
 */
import java.util.Scanner;
import java.io.*;
import java.util.InputMismatchException;
public class Lab5_2 {
    public static void main(String[] args) {
        try {
            // try to get an integer from the user
            int x = getInt();
            // if there are no exceptions print the integer
            System.out.println("Entered Value: " + x);
            // if a value is entered that is a non integer catch it
        } catch(IOException e) {
            // print the proper message (IOException message)
            System.out.println(e.getMessage());
        }
    }

    public static int getInt() throws IOException {
        int userInt;
        try {
            // create a scanner object
            Scanner scan = new Scanner(System.in);
            // ask the user to enter an integer
            System.out.println("Enter an integer: ");
            // if an integer is entered, create a variable and initialize it to the value
            userInt = scan.nextInt();

            // if the value is a non integer catch the exception
        } catch(InputMismatchException e) {
            // throw an IOException, showing provided message
            throw new IOException("Value is not an integer.");
        }
        // return the value to main to be printed
        return userInt;
    }    
}
