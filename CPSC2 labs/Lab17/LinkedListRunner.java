import java.util.LinkedList;
import java.util.*;
import java.util.List;
public class LinkedListRunner {
    public static void main(String[] args) {
        // instantiate a LinkedList of String values
        LinkedList<String> strings = new LinkedList<String>();

        // add following values to the list
        strings.add("aaa");
        strings.add("bbb");
        strings.add("ccc");
        strings.add("ddd");
        strings.add("eee");
        strings.add("fff");
        strings.add("ggg");
        strings.add("hhh");
        strings.add("iii");

        // build a LinkList Iterator of String values
        ListIterator<String> iter = strings.listIterator();

        // walk though the linked list in order of occurance and print the values out
        System.out.println("Initial Linkedlist: ");
        while(iter.hasNext()) {
            System.out.println(iter.next());
        }

        System.out.println(" ");

        // walk backwards through the list and remove all String values that start with a vowel
        while(iter.hasPrevious()) { 
            char firstChar = iter.previous().charAt(0);
            char a = 'a', e = 'e', i = 'i', o = 'o', u = 'u';
            if(firstChar == a) {
                iter.remove();
            } else if(firstChar == e) {
                iter.remove();
            } else if(firstChar == i) {
                iter.remove();
            } else if(firstChar == o) {
                iter.remove();
            } else if(firstChar == u) {
                iter.remove();  
            }

        }

        // walk through the linked list in order of occurance (the vowels should be gone) 
        System.out.println("Linkedlist after removing values that start with a vowel: ");
        while(iter.hasNext()) {
            System.out.println(iter.next());
        }
    }
}