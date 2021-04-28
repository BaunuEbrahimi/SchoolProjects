import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.NoSuchElementException;
import java.text.DecimalFormat;
import javax.swing.JFileChooser;
import java.io.*;
import javax.swing.JOptionPane;   
import java.awt.EventQueue;

public class TriangleAssignment {
    static int side1;
    static int side2;
    static int side3;
    static int validEntries = 0;
    static int result;

    /* JFileChooser: Works on Windows but not Mac
    static File getInputFile(Scanner scan) throws FileNotFoundException, IOException, Exception {
        boolean cont = true;
        File file = null;
        while (cont) {
            System.out.print("Enter the name of your input file: ");
            String filename = scan.next();
            file = new File(filename);
            if (file.exists()) {
                cont = false;
            } else {
                JOptionPane.showMessageDialog(null, "The input file was not found.");
                JFileChooser fileChooser = new JFileChooser();
                fileChooser.setCurrentDirectory(new File(System.getProperty("user.home")));
                result = fileChooser.showOpenDialog(null);
                if (result == JFileChooser.APPROVE_OPTION)  {
                    cont = false;
                    file = fileChooser.getSelectedFile();
                }
            }
        }
        return file;
    }  
    */  
    
    //ask user to enter the name of the input file
    static File getInputFile(Scanner scan) throws FileNotFoundException, Exception {
        System.out.print("Enter the name of your input file: ");
        String filename = scan.next();
        File file = new File(filename);
        if (file.exists()) {
            // if file exists return file and continue
            return file;
        } else {
            boolean cont = true;
            while (cont) {
                // if file does not exist give user error and repromt 
                System.out.println("INPUT FILE NOT FOUND. TRY AGAIN: ");
                System.out.print("Enter the name of your input file: ");
                filename = scan.next();
                file = new File(filename);
                if (!(file.exists())) {
                    // continue to repromt until a file is found
                    continue;
                } 
                if (file.exists()) {
                    // if file exists tell user with JOptionPane and then continue
                    JOptionPane.showMessageDialog(null, "File found.");  
                    cont = false;
                }
            }
            //return file
            return file;
        }
    }
    // ask user to enter the name of the output file 
    static File getOutputFile(Scanner scan) throws FileNotFoundException, Exception {
        System.out.print("Enter the name of your output file: ");
        String filename = scan.next();
        File file = new File(filename);
        if (file.exists()) {
            // if file exists return file and continue
            return file;
        } else {
            boolean cont = true;
            while (cont) {
                // if file does not exist give user error and repromt 
                System.out.println("OUTPUT FILE NOT FOUND. TRY AGAIN: ");
                System.out.print("Enter the name of your output file: ");
                filename = scan.next();
                file = new File(filename);
                if (!(file.exists())) {
                    // continue to repromt until a file is found
                    continue;
                } 
                if (file.exists()) {
                    // if file exists tell user with JOptionPane and then continue
                    JOptionPane.showMessageDialog(null, "File found.");  
                    cont = false;
                }
            }
            // return file
            return file;
        }
    }
    // calculate right triangle, check if the square root of side one plus side two equals side three
    static boolean isRightTriangle(ArrayList<String> line) {
        boolean isRightTriangle = Math.sqrt(Math.pow(side1, 2) + Math.pow(side2, 2)) == side3;
        return isRightTriangle;    
    }
    // calculate area of triangle using Heron's Formula and file sides
    static String areaOfTriangle(ArrayList<String> line) {
        double a = side1, b = side2, c = side3; 
        double s = ((a + b + c)/2); 
        // make sure calculated area is rounded to the nearest hundredth
        DecimalFormat f = new DecimalFormat("##.00");
        return f.format(Math.sqrt(s * (s - a) * (s - b) * (s - c)));    
    }
    // output to user the file's triangle types for each line  
    static void typeOfTriangle(ArrayList<String> line, PrintWriter writer) {
        if (isRightTriangle(line)) {
            writer.append("The triangle is a right triangle.\n");
            System.out.println("The triangle is a right triangle.");
        } else if (side1 == side2  && side2 == side3) {
            writer.append("The triangle is equilateral.\n");
            System.out.println("The triangle is equilateral.");
        } else if ((side1 == side2  || side2 == side3) && !(side1 == side2 && side2 == side3)) { 
            writer.append("The triangle is isosceles.\n");
            System.out.println("The triangle is isosceles.");
        } else {
            writer.append("This triangle is not distinctive.\n");
            System.out.println("This triangle is not distinctive.");    
        }
        writer.append("The area of this triangle is " + (areaOfTriangle(line)) + "\n");
        System.out.println("The area of this triangle is " + (areaOfTriangle(line)));
    }
    // output file path and a summary report of file info
    static void fileData(File inputFile, PrintWriter outputWriter, int lineNumber, int validEntries) {
        double percentValidEntries = ((validEntries / ((double)lineNumber)) * 100) ;
        int invalidEntries = (lineNumber - validEntries);
        outputWriter.append("EOF found\n");
        System.out.println("EOF found");
        outputWriter.append("File Path: " + inputFile.getAbsolutePath() + "\n");
        System.out.println("File Path: " + inputFile.getAbsolutePath());
        outputWriter.append("--------------- Summary Report ---------------" + "\n");
        System.out.println("--------------- Summary Report ---------------");
        outputWriter.append("Total enteries processed 		= " + lineNumber + "\n");
        System.out.println("Total enteries processed 		= " + lineNumber);
        outputWriter.append("Number of valid entries 		= " + validEntries + "\n");
        System.out.println("Number of valid entries 		= " + validEntries);
        outputWriter.append("Number of invalid entries 		= " + invalidEntries + "\n");
        System.out.println("Number of invalid entries 		= " + invalidEntries);
        outputWriter.printf("Percentage of valid entries     = %.5s%%",  percentValidEntries + "\n");
        System.out.printf("Percentage of valid entries         	= %.2f%%",  percentValidEntries);
    }
    public static void main(String[] args) throws FileNotFoundException, IOException, Exception {
        // welcome user
        System.out.println("Welcome to the Triangle Classifier program");
        Scanner systemScanner = new Scanner(System.in);
        // get input file
        File inputFile = getInputFile(systemScanner);
        Scanner inputScanner = new Scanner(inputFile);
        File outputFile = getOutputFile(systemScanner);
        // open output file writer
        PrintWriter outputWriter = new PrintWriter(outputFile);
        systemScanner.close();

        int lineNumber = 0;
        // check if file has next line and do below code
        while (inputScanner.hasNextLine()) { 
            // create array list with scanned in sides for each line and split the lines based on whitespace
            ArrayList<String> line = new ArrayList<String>(Arrays.asList(inputScanner.nextLine().split(" ")));
            String hash = "#";
            String lineStart = line.get(0);
            // only do below code (scan in sides and check for exceptions and print necessary info) IF line starts with a #
            if (lineStart.equals(hash)) {
            // count each line
            lineNumber++;
            //remove the hash 
            line.remove(0);
            boolean triangleGood = true;
            try {
                // print out line number
                outputWriter.append(lineNumber + ":\n");
                System.out.println(lineNumber + ":");
                // initalize all three sides
                side1 = Integer.parseInt(line.get(0));
                side2 = Integer.parseInt(line.get(1));
                side3 = Integer.parseInt(line.get(2));
                // if there are more items than three sides discard them
                if (line.size() != 3) {
                    while (line.size() > 3) {
                        // delete extraneous data
                        outputWriter.append("Item discarded: " + line.get(3) + "\n"); // print disregarded info
                        System.out.println("Item discarded: " + line.get(3));
                        line.remove(3);
                    }
                } 

                if (side1 > side2 || side2 > side3) {
                    // if sides are not in ascending order print error
                    triangleGood = false;
                    outputWriter.append("Error - Sides not in ascending order.\n");
                    System.out.println("Error - Sides not in ascending order.");
    
                }  
                if (side1 <= 0 || side2 <= 0 || side3 <= 0) {
                    // print out error message if side is less than or equal to zero
                    triangleGood = false;
                    outputWriter.append("Error - At least one of your sides is an invalid integer value.\n");
                    System.out.println("Error - At least one of your sides is an invalid integer value.");
                }

            } catch (NumberFormatException e) {
                // if side is not an integer print error
                triangleGood = false;
                outputWriter.append("Error - At least one of your sides is not an integer.\n");
                System.out.println("Error - At least one of your sides is not an integer.");
                
            } catch (IndexOutOfBoundsException e) {
                // if there are less than three sides print error
                triangleGood = false;
                outputWriter.append("Error - Not enough sides.\n");
                System.out.println("Error - Not enough sides.");
            } 
            
            if (side1 + side2 < side3 || side1 + side2 == side3) {
                // if sides do not form a valid triangle print error
                triangleGood = false;
                outputWriter.append("Error - Sides cannot form a valid triangle.\n");
                System.out.println("Error - Sides cannot form a valid triangle.");
            }

            // if none of the above exceptions occur do below
            if (triangleGood) { 
                // count vaild entries
                validEntries++;
                // print the 3 sides
                outputWriter.println(side1 + ", " + side2 + ", " + side3 + ":");
                System.out.println(side1 + ", " + side2 + ", " + side3);
                // print triangle type and area
                typeOfTriangle(line, outputWriter);
            }
        }
    } 
        // once end of file is detected(when there are no more lines) print file summary report
        fileData(inputFile, outputWriter, lineNumber, validEntries);
        // close inputFile/Scanner
        inputScanner.close();
        // close outputFile/Scanner
        outputWriter.close();
    }
} 