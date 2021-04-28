/*
 * Lab 3: Basic ArrayList   
 * Programmer:  Baunu Ebrahimi
 */
import java.util.ArrayList;
public class ArrayListRunner {
    public static void main(String[] args) {
        // create an ArrayList named "names"
        ArrayList<String> names = new ArrayList<String>();
        System.out.println("Here is an empty ArrayList called \"names\": ");
        System.out.println(names);
    
        //a: add names to the ArrayList
        System.out.println("\nHere is the ArrayList after names are added to it: ");
        names.add("Alice");
        names.add("Bob");
        names.add("Connie");
        names.add("David");
        names.add("Edward");
        names.add("Fran");
        names.add("Gomez");
        names.add("Harry");
        System.out.println(names);
        
        //b: get the first and last names of the ArrayList
        String firstName = names.get(0);
        System.out.println("\nThe first name in the ArrayList is: " + firstName);
        String lastName = names.get(7);
        System.out.println("The last name in the ArrayList is: " + lastName);
        
        //c: get the size of the ArrayList
        int size = names.size();
        System.out.println("\nThe ArrayList size is: " + size);
        
        //d: get the last name of the ArrayList with .size()-1;
        String lastName2 = names.get(names.size()-1);
        System.out.println("\nThe last name in the ArrayList is: " + lastName);
        
        //e: add "B. Toklas" to the first name in the ArrayList
        System.out.println("\nThe previous name \"Alice\" has been updated: ");
        names.set(0, "Alice B. Toklas");
        System.out.println(names);
        
        //f: add Doug after David in the ArrayList
        System.out.println("\nThe name \"Doug\" has been added to the ArrayList:  ");
        names.add(4, "Doug");
        System.out.println(names);
        
        //g: print out the ArrayList with an enhanced for loop
        System.out.println("\nHere is the ArrayList printed using an enhanced for loop: ");
        for(String arrayNames : names) {
            System.out.println(arrayNames);
        }
        
        //h: create a new ArrayList constructor and pass the ArrayList "names" into it
        System.out.println("\nHere is the ArrayList printed by passing an " 
        + "ArrayList into an ArrayList constructor called \"names2\": ");
        // create ArrayList constructor "names2"
        ArrayList<String> names2 = new ArrayList<String>(names);
        // print the new ArrayList
        System.out.println(names2);
        
        //i: remove the first name in the "names" ArrayList and show that it only affects the "names" ArrayList not the "names2"
        System.out.println("\nAs you will see below, the first name in the ArrayList "
        + "\"names\" has been removed, but remains in names2: ");
        // remove the first name of "names"
        names.remove(0);
        // print out names
        System.out.println("names: ");
        System.out.println(names);
        // print out names2
        System.out.println("names2: ");
        System.out.println(names2);
    }
}
