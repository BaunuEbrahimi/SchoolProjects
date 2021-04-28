/*
 * Lab 6.2.1:   Building an array of names
 * Programmer:  Baunu Ebrahimi
 */
public class CustomerLister {
    public static void main(String[] args) {
        // instantiate an array of String Objects called customerName 
        // with room for 5 String objects
        String[] customerName = {"Cathy", "Ben", "Jorge", "Wanda", "Freddie"};
        
        System.out.println("Customer Names: \n");
        int size = customerName.length;
        for (int i = 0; i < size; i++) {
            //print the array of names
            System.out.println(customerName[i]);
        }

    }
}
