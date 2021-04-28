/*
 * Lab 6.1.1:   Creating and print arrays
 * Programmer:  Baunu Ebrahimi
 */
public class Array_Lab6_1_1 {
    public static void main(String[] args) {
      //a create array of doubles named x
      double[] x = {8, 4, 5, 21, 7, 9, 18, 2, 100};
      
      //b using standard for loop, print array with lables to indicate each element
      System.out.println("\nfor loop, array with labels: ");
      int size = x.length;
      for (int i = 0; i < size; i++) {
        System.out.println("x[" + i +"]= " + x[i] );
      }
      
      //c using standard for loop, print array in reverse order with labels to indicate each element
      System.out.println("\nfor loop, array in reverse with labels: ");
      size = x.length;
      for (int i = size - 1; i >= 0; i--) {
        System.out.println("x[" + i +"]= " + x[i] );
      }
      
      //d using an enhanced for loop, print array values without labels
      System.out.println("\nEnhanced for loop, array without labels: ");
      for(double element : x) {
        System.out.println(element);
      }

    }
}
