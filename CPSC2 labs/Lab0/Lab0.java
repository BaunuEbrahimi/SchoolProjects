import java.util.Scanner;
/*
 * Testing your Java basic knowledge and programming skills.
 */

public class Lab0 {
    public static void main(String[] args) {
        // create scanner to read user input
        Scanner scan = new Scanner(System.in);   

        /* test the power method
        input: 2.0, 10, Expected:1024 */ 

        // read a base from the keyboard
        System.out.println("Enter a base (#): ");
        double base = scan.nextDouble();
        
        // read a degree from the keyboard
        System.out.println("Enter a degree for the base (#): ");
        int degree = scan.nextInt();
        
        //print power results 
        System.out.printf("The calculated power is: %.2f\n\n", power(base, degree));

        /* test the factorial method
        input: 6, Expected: 720 */
        
        // read a number from the keyboard
        System.out.print("Enter a number you would like to calculate the factorial of: ");
        int n = scan.nextInt();

        //print factorial results 
        System.out.printf("The calculated factorial of %d is: %d", n, factorial(n));
    }  

    // calculating power i.e., base^degree (2.0)^10=1024.0
    public static double power(double base, int degree) {
        double power = 1;
        while(degree != 0) {
            power = power * base;
            --degree;
        }
        return power;
    }

    // calculating factorial of n, i.e., 5!=5*4*3*2*1=120
    public static long factorial(int n) {
        long factorial = 1;
        for(int i = 1; i <= n; i++) {
            factorial = factorial * i;
        }
        return factorial;
    }   
}
