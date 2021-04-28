/*
 * Lab 4: Scanning Files   
 * Programmer:  Baunu Ebrahimi
 */
import java.io.*;
import java.util.Scanner;
public class Lab4 {
    public static void main (String[] args) throws IOException {
        // Write to a file named "numbers.txt"
        PrintWriter outputFile = new PrintWriter("numbers.txt");
        // add necessary numbers
        outputFile.print(1.0 + "   ");
        outputFile.print(2.0 + "  ");
        outputFile.print(3.0 + "  ");
        outputFile.println(4.0 + "   ");
        outputFile.print(2.0 + "   ");
        outputFile.print(3.0 + "  ");
        outputFile.print(4.0 + "  ");
        outputFile.println(5.0 + "  ");
        outputFile.print(3.0 + "   ");
        outputFile.print(4.0 + "  ");
        outputFile.print(5.0 + "  ");
        outputFile.print(6.0 + "  ");
        outputFile.println(7.0 + "   ");
        outputFile.print(6.0 + "   ");
        outputFile.print(7.0 + "  ");
        outputFile.print(8.0 + "  ");
        outputFile.print(9.0 + " ");
        outputFile.print(10.0 + "   ");
        // close the file
        outputFile.close();

        // Read through the file "numbers.txt"
        File myFile = new File("numbers.txt");
        Scanner inputFile = new Scanner(myFile);

        int lineNumber = 1;
        // while the file has a next line...
        while(inputFile.hasNextLine()) {
            // create a string with the data/numbers in the line
            String line = inputFile.nextLine();
            // create a scanner that passes in the string
            Scanner input2 = new Scanner(line);

            // create an accumulator to hold the sum of the line 
            double sum = 0.0; 
            // while the line has a new number...
            while(input2.hasNext()) {
                double number = input2.nextDouble();
                // add the number to the previous number to get a sum of all numbers in the line
                sum = sum + number;
            }
            // print out the line number and sum of the numbers in that line
            System.out.println("Line " + lineNumber + ": " + sum);
            // increment the line number by 1
            lineNumber++;
        }
        // close the file
        inputFile.close();
    }
}
