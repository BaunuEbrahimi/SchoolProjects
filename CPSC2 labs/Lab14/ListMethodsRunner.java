import java.util.ArrayList;
public class ListMethodsRunner {
    public static void main(String[] args) {
        // create an ArrayList equal to the ListMethods class makeList method where n = 0 or n = 100
        ArrayList<Integer> tempList = ListMethods.makeList(0);
        //ArrayList<Integer> tempList = ListMethods.makeList(100);
        if (tempList.size() == 0) {
            // if the size of the ArrayList is 0 or less print "The list is empty"
            System.out.println("The list is empty");
        } else {
            // if the size of the ArrayList is not 0 or less, print out the ArrayList values up to n using an enhanced for loop
            for (Integer i : tempList) {
                System.out.println(i);
            }
        }
    }
} 