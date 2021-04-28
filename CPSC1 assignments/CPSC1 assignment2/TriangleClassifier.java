import java.util.Scanner;
import java.util.ArrayList;
import java.text.DecimalFormat; 

public class TriangleClassifier {
    // calculate right triangle, check if the square root of side one plus side two equals side three
    static boolean isRightTriangle(ArrayList<Integer> sides) {
        boolean isRightTriangle = Math.sqrt(Math.pow(sides.get(0), 2) + Math.pow(sides.get(1), 2)) == sides.get(2);
        return isRightTriangle;    
    }
    // calculate area of triangle using Heron's Formula and inputed sides
    static String areaOfTriangle(ArrayList<Integer> sides) {
        double a = sides.get(0), b = sides.get(1), c = sides.get(2); 
        double s = ((a + b + c)/2); 
        // make sure calculated area is rounded to the nearest hundredth
        DecimalFormat f = new DecimalFormat("##.00");
        return f.format(Math.sqrt(s * (s - a) * (s - b) * (s - c)));    
    }
    public static void main(String[] args) {
        // welcome user
        System.out.println("Welcome to the Triangle Classifier program");
        // ask the user for 3 sides in ascending order
        System.out.print("Enter the lengths of the three (3) triangle sides in ascending order: ");
        // initialize scanner
        Scanner scan = new Scanner(System.in);
        // loop through sides to check if each side is a valid value
        ArrayList<Integer> sides = new ArrayList<Integer>();
        for (int i = 0; i < 3; i++) {
            if (scan.hasNextInt()) {
                int side = scan.nextInt();
                if (side <= 0) {
                    // print out error message if side is less than or equal to zero
                    System.out.println("Error - At least one of your sides is an invalid value.");
                    // exit system if one side is an invalid value
                    System.exit(0);
                }
                sides.add(side);
            } 
            else {
                // print out error message if side is not an integer
                System.out.println("Error - At least one of your sides is not an integer.");
                // exit system if one side is not an integer
                System.exit(0);
            }
        }
        // close scanner after all sides are checked
        scan.close();
        // check if all sides are in ascending order
        if (sides.get(0) > sides.get(1) || sides.get(1) > sides.get(2)) {
            System.out.println("Error - Sides not in ascending order.");
            // exit system if sides are not in ascending order
            System.exit(0);
        } if (sides.get(0) + sides.get(1) < sides.get(2) || sides.get(0) + sides.get(1) == sides.get(2)) {
            System.out.println("Error - Sides cannot form a valid triangle.");
            // exit system if sides are not in ascending order
            System.exit(0);
        }
        // give user necessary output, triangle type
        if (isRightTriangle(sides)) {
            System.out.println("The triangle is a right triangle.");
        } else if (sides.get(0) == sides.get(1)  && sides.get(1) == sides.get(2)) {
            System.out.println("The triangle is equilateral.");
        } else if ((sides.get(0) == sides.get(1)  || sides.get(1) == sides.get(2)) && !(sides.get(0) == sides.get(1) && sides.get(1) == sides.get(2))) { 
            System.out.println("The triangle is isosceles.");
        } else {
            System.out.println("This triangle is not distinctive.");
        }
        // give user area of triangle
        System.out.println("The area of this triangle is " + (areaOfTriangle(sides)));
    }
}   










