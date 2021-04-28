import java.util.*;
public class ListMethods {
    public static ArrayList<Integer> makeList(int n) {
        // created an ArrayList that holds integer values
        ArrayList<Integer> tempList = new ArrayList<Integer>() ;
        // if the ArrayList has a size of 0 or less...
        if (n <= 0) { // The smallest list we can make (base)
            // return ArrayList 
            return tempList;   
        } else { // All other size lists are created here(general)
            // if the ArrayList size is not 0 or less, get the numbers 1 to n - 1, by calling the makeList method
            tempList = makeList(n - 1);
            // add the values up to n to the ArrayList
            tempList.add(n);
        }
        // return the ArrayList
        return tempList;
    }
} 