import java.util.*;
import java.util.Scanner;
public class InsertionSort {
    // instance variable(s)
    public static int next;
    public static int value; 
    
    /**
    A method to make an almost sorted array into fully sorted.

    @param arr: an array of integers, with all the numbers are sorted
    excepted the last one

    @param size: the number of elements in an array
     */
    public static void insertLast(int[] arr, int size) {
        System.out.println("\nDetailed shifting outputs: ");
        // iterate size - 1 steps
        for (int i = 0; i < size; i++) {
            // pick the next value from unsorted region
            next = arr[i];
            // move the larger elements up
            int j = i;
            while(j > 0 && arr[j - 1] > next) {
                arr[j] = arr[j - 1];
                value = arr[j];
                j--; 
                // see the details for each step of inserting
                printArray(arr, size, value);                
            }
            // now insert the element into the right position
            arr[j] = next;
        } 
        // see the details for each step of inserting
        printArray(arr, size);
    }

    /**
    A method to make an unsorted array into fully sorted.

    @param arr: an array of integers

    @param size: the number of elements in an array
     */
    public static void insertionSort(int[] arr, int size) {
        // create variables to count the number of shifts for each iteration and number of shifts in total
        int totalShifts = 0;
        int shiftsOnLoop;        

        System.out.println("\nStart sorting: ");   
        // print the original array
        for (int i = 0; i < size; i++) {
            if (i == 0 ) {
                System.out.print("" + arr[i] + "|");
            } else {
                System.out.print("" + arr[i] + " ");
            }
        }        
        System.out.print("\t//Original array");

        System.out.println("");

        // iterate size - 1 steps
        for (int i = 1; i < size; i++) {   
            shiftsOnLoop = 0;
            // pick the next value from unsorted region
            int next = arr[i];
            // move the larger elements up
            int j = i;
            while(j > 0 && arr[j - 1] > next) {
                arr[j] = arr[j - 1];
                j--;  
                // count shifting information
                totalShifts++; 
                shiftsOnLoop++;
            }
            // now insert the element into the right position
            arr[j] = next;
            // see the details for each step of inserting
            printArray(arr, size, i, shiftsOnLoop);          
        }
        //print the total number of shifts
        System.out.println("\nTotal Shifts: " + totalShifts);
    }

    // print the intermediate array content and the comparing pair information
    public static void printArray(int [] arr, int size, int value) {
        for (int i = 0; i < size; i++) {
            System.out.print("" + arr[i]+" ");
        }
        System.out.printf("\t//%d > %d, %d is shifted one cell to the right\n", value, next, value);
    }

    // print final array with previously unsorted value placed in correct position
    public static void printArray(int [] arr, int size) {
        for (int i = 0; i < size; i++) {
            System.out.print("" + arr[i]+" ");
        }
        System.out.printf("\t//%d is placed into the right position\n", next);
    }

    // print the intermediate array content and detailed shifting information 
    public static void printArray(int [] arr, int size, int sp, int shiftsOnLoop) {
        for (int i = 0; i < size; i++) {
            if (i == sp) {
                System.out.print("" + arr[i]+"|");
            } else {
                System.out.print("" + arr[i]+" ");
            }            
        } 
        System.out.printf("\t//Shifts: %d \n", shiftsOnLoop);
    }

    public static void main(String[] args) {
        // print user choices
        System.out.println("Choose from the following options: ");
        System.out.println("---------------------------------- ");
        System.out.println("1: Insertion Part #1\n2: Insertion Part #2\n3: Quit");
        System.out.println("---------------------------------- \n");

        // scan in user choice
        Scanner scan = new Scanner(System.in);
        int choice = scan.nextInt();
        
        // print user directions based on their choice
        if (choice == 1) {
            // prompt user
            System.out.println("Enter sorted numbers except the last number, followed by q: ");  
        }

        if (choice == 2) {
            // prompt user
            System.out.println("Enter a bunch of numbers followed by q: ");
        }

        // based on user choice do either insertion part 1 or 2, quit only if user chooses 3
        do {
            if (choice == 1) {              
                // create array
                int [] numbers = new int[100];
                int count = 0;

                // read numbers into an array
                Scanner in = new Scanner(System.in);
                while (in.hasNextInt()) {
                    numbers[count] = in.nextInt();                    
                    count++;
                }
                // set array values and array size, call method of user choice "1"
                insertLast(numbers, count);
            } else if(choice == 2) {                
                // create array
                int [] numbers = new int[100];
                int count = 0;

                // read numbers into an array
                Scanner in = new Scanner(System.in);
                while (in.hasNextInt()) {
                    numbers[count] = in.nextInt();
                    count++;
                }
                // set array values and array size, call method of user choice "2"
                insertionSort(numbers, count);
            }        
        } while(choice != 3);
    }
}