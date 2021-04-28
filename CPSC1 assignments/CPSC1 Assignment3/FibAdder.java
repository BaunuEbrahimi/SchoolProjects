import java.util.Scanner;
import java.util.ArrayList;
import java.math.BigInteger;

public class FibAdder {
    static BigInteger fib(int n) {
        // create ArrayList to add first two fib numbers to the sequence 
        ArrayList<BigInteger> fibonacciNumbers = new ArrayList<BigInteger>();
        fibonacciNumbers.add(BigInteger.ZERO);
        fibonacciNumbers.add(BigInteger.ONE);
        
        BigInteger nextNumber;
        BigInteger sum = BigInteger.ZERO;
        // create for Loop to compute the Fibonacci Sequence
        for(int i = 0; i < n; i++) {
            nextNumber = fibonacciNumbers.get(fibonacciNumbers.size() - 1).add(fibonacciNumbers.get(fibonacciNumbers.size() - 2));
            fibonacciNumbers.add(nextNumber);
            // calculate the sum 
            sum = sum.add(fibonacciNumbers.get(i));
        }
        return sum; 
    }
    public static void main(String[] args) {
        System.out.println("Welcome to the Fibonacci Adder");
        System.out.println("To quit, enter a non-integer number or string\n");
        // initialize scanner
        Scanner scan = new Scanner(System.in);
        System.out.println("How many Fibonacci numbers should be summed?");

        // create while loop to continuously prompt user for a number if boolean variable is true
        boolean cont = true;
        while(cont) {
            if(scan.hasNextInt()) {
                // scan in number
                int n = scan.nextInt();
                BigInteger summation = fib(n);
                // tell user that 0 numbers can not be summed, but state that zero is the first fib number
                if (n == 0) {
                    System.out.println("0 numbers can not be summed, however, the value of the first Fibonacci number is: 0\n");
                // tell user that 1 number can not be summed, but state that one is the second and third fib number
                } else if (n == 1) {
                    System.out.println("1 number can not be summed, however, the value of the second and third Fibonacci numbers are: 1\n");
                // tell user that their inputed number is not in the range of the fib sequence (is less than 0)
                } else if (n < 0) {
                    System.out.printf("Error: %d is not in the range of the Fibonacci number sequence.", n);
                }
                // tell user the sum of the first n (user input) numbers
                else {
                    System.out.println("The sum of the first " + n + " Fibonacci numbers is: " + summation.toString());   
                }
                // prompt user for new number
                System.out.println("How many Fibonacci numbers should be summed?");
            // if non-integer or string is inputed (boolean variable becomes false) exit fib adder
            } else {
                cont = false;
                System.out.printf("Thank You for Using the Fibonacci Adder!"); 
            } 
        }
    }    
}
  

