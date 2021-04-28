import java.util.*;
public class LinkedList {
    // instance variable(s)
    private Node first;

    /** 
     * Constructs an empty linked list.
     */
    public LinkedList() { 
        first = null; 
    }

    /** 
     * Gets the first element in the linked list and returns it.
     * Throw NoSuchElementException if the list is empty.
     */
    public Object getFirst() {
        if (first == null) { 
            throw new NoSuchElementException(); 
        }
        return first.data;
    }

    /**
     * Adds an element to the front of the linked list.
     * @param element the element to add
     */
    public void addFirst(Object element) {
        // create a node and assign the values to members
        Node newNode = new Node();
        newNode.data = element;
        newNode.next = first;
        // copy the reference of newNode to first
        first = newNode;
    }

    /**
     *  toString method
     */
    public String toString() {
        String temp = "";
        Node current = first;
        while (current != null) {
            temp = temp + current.data.toString() + '\n';
            current = current.next;
        }
        return temp;
    }

    // inner Node class
    class Node {
        public Object data;
        public Node next;
    }
}