import java.util.Scanner;
import java.util.ArrayList;

public class FibSequence {  
    static ArrayList<Long> fib(long number) {
        // create ArrayList to compute the Fibonacci Sequence
        ArrayList<Long> fibonacciNumbers = new ArrayList<Long>();
        fibonacciNumbers.add(0L);
        fibonacciNumbers.add(1L);
        
        long nextNumber = -1;
        while (nextNumber <= number) {
            nextNumber = fibonacciNumbers.get(fibonacciNumbers.size() - 1) + fibonacciNumbers.get(fibonacciNumbers.size() - 2);
            fibonacciNumbers.add(nextNumber);

        }
        return fibonacciNumbers;
    }
    public static void main(String[] args) {
        System.out.println("Welcome to the Fibonacci Sequence Detector");
        System.out.println("To quit, enter a non-integer number or string\n");
        // initialize scanner
        Scanner scan = new Scanner(System.in);
        System.out.println("Please input a number for analysis: ");
        // create while loop to continuously prompt user for a number if boolean variable is true
        boolean cont = true;
        while(cont) {
        if(scan.hasNextLong()) {
        // scan in number
        long number = scan.nextLong();
        ArrayList<Long> fibonacciNumbers = fib(number);
            // tell the user if 0 is a fib number and its order
            if (number == 0) {
                System.out.println("0 is a Fibonacci number whose order in the sequence is 1\n");
            // tell the user if 1 is a fib number and its order
            } else if (number == 1) {
               System.out.println("1 is a Fibonacci number whose order in the sequence is both 2 and 3\n");   
            // tell the user if the inputed number is a fib number and its order
            } else if (fibonacciNumbers.contains(number)) {
                System.out.printf("%d is a Fibonacci number whose order in the sequence is %d\n", number,fibonacciNumbers.size() - 1);
            // tell user that their inputed number is not in the range of the fib sequence (is less than 0)
            } else if (number < 0) {
                System.out.printf("Error: %d is not in the range of the Fibonacci number sequence.\n", number);
            // tell user that their inputed number is not a fib number, but provide the fib numbers above and below it
            } else {
                System.out.printf("%d is not a Fibonacci number\n", number);
                System.out.printf("However, it lies between Fibonacci numbers %d (order: %d) and %d (order: %d)\n", fibonacciNumbers.get(fibonacciNumbers.size() - 2), (fibonacciNumbers.size() - 1), fibonacciNumbers.get(fibonacciNumbers.size() - 1), (fibonacciNumbers.size()));
            }
            // prompt user for new number
            System.out.println("Please input a number for analysis: ");
            // if non-integer or string is inputed (boolean variable becomes false) exit fib sequence detector
            } else {
                cont = false;
                System.out.println("Thank You for Using the Fibonacci Sequence Detector!");
            }
        }
    }
} 
    

  