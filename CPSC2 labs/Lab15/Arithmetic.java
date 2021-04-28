import java.util.Scanner;
public class Arithmetic {
    // instance variable(s)
    static int value; 
    public static int gcd(int a, int b) { 
        boolean cont = true;
        // while cont is true
        while(cont) {
            // if a or b is zero return the non zero value and make cont = false
            if(a == 0 && b > 0) { //base case
                value = b;
                cont = false;
                // return the value
                return value;
            } else if(b == 0 && a > 0) {
                value = a;
                cont = false;
                // return the value
                return value;
            } else { //general case
                // if neither a or b is zero keep finding the remainder of the larger value divided by the smaller (cont = true) until value is zero
                if(a > b) {
                    // set the larger value to the remainder of the larger value divided by the smaller
                    a = a % b; 
                } else if (b > a) {
                    // set the larger value to the remainder of the larger value divided by the smaller
                    b = b % a;
                }
            }                        
        }
        // return the value
        return value;
    }
}