import java.util.Scanner;
public class BubbleSortTester {
    public static void main() {
        // create a BubbleSort object
        BubbleSort sort = new BubbleSort();
        int [] numbers = new int[100];
        int count= 0;

        // read user inputed numbers into an array
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a bunch of numbers followed by q: ");
        while(in.hasNextInt()) {
            numbers[count] = in.nextInt();
            // adjust the array size
            count++;
        }

        // print first before sorting
        System.out.println("\nBefore sorting:");
        sort.printArray(numbers, count);

        // sorting
        System.out.println("\nStart sorting:");
        sort.bubbleSort(numbers, count);

        // print the array after sorting 
        System.out.println("\nAfter sorting:");
        sort.printArray(numbers, count);
    }
}