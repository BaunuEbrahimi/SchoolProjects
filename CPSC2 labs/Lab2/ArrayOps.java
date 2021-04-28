/*
 * Lab 2: Find middle element(s) of array
 * Programmer:  Baunu Ebrahimi
 */

public class ArrayOps {
    /**
    This method accepts and integer array as a parameter, and then
    returns the "middle" value of the array.
    For an array of odd length, this would be the actual middle value.
    For an array of even length, there are TWO middle values, so only
    the first of the two values is returned.
    @param values, an array of integers
    @ return, the "middle" element of the array
     */
    static int midOfArray;
    public static int middleValue(int values[]) {
        // if the length of the array is odd do:
        if(values.length % 2 == 1) {
            // set the middle value equal to the value located in the middle of the array(values[]) by  
            midOfArray = values[values.length/2];
        }
        // if the length of the array is even do:
        if(values.length % 2 == 0) {
            // set the middle value equal to the first value of the two
            //located in the middle of the array (values[])
            midOfArray = values[(values.length/2) - 1];
        }
        // return the middle value
        return midOfArray;
    }

    public static void main(String[] args) {
        // Odd Length Array: 
        //int[] values = {1, 2, 5, 8, 3, 7, 9};

        // Even Length Array: 
        int[] values = {19, 3, 33, 12, 18, 23}; 
        
        // print out all of the values inside the array for user reference
        System.out.print("Array: ");
        for( int element : values) {
            System.out.print(element + " ");
        }
        
        // print the middle of the array
        System.out.println("\nThe middle element of the array is: " + middleValue(values));
    }
}
