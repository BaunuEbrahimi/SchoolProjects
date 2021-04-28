import java.util.*;
public class BubbleSort {
    // print the whole array
    public static void printArray(int [] arr, int size){
        for (int i = 0; i < size; i++) {
            System.out.print("" + arr[i]+" ");
        }
        System.out.println();
    }

    // print the whole array and a separator at position sp
    public static void printArray(int [] arr, int size, int sp){
        for (int i = 0; i < size; i++) {
            if(i == sp) {
                System.out.print("" + arr[i] + "|");
            } else {
                System.out.print("" + arr[i] + " ");
            }
        }
        System.out.println();
    }

    // bubble sort method
    public static void bubbleSort(int [] arr, int size) {
        // scan through the array
        for (int i = 0; i < size - 1; i++) {
            // compare the current value and next value in the array 
            for (int j = 0; j < size - i - 1; j++) {
                // if the current value is bigger than the next value...
                if(arr[j] > arr[j + 1]) {
                    // switch the two values
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
            // show the details for each iteration
            System.out.println("Sorting iteration: " + (i + 1));
            printArray(arr, size, i);
        }
    }
}