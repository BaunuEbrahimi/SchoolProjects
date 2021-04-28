import java.util.Scanner;
public class ArithmeticTester { 
    public static void main (String[] args) {
        // create an Arithmetic object 
        Arithmetic findGCD = new Arithmetic();
        // create scanner to get user values
        Scanner scan = new Scanner(System.in);
        // ask the user for an x value
        System.out.println("Enter the first number(x): ");
        int a = scan.nextInt();
        // ask the user for a y value
        System.out.println("Enter the second number(y): ");
        int b = scan.nextInt();
        // print out the calculated GCD 
        System.out.println("The GCD is: " + findGCD.gcd(a, b));
    }
}