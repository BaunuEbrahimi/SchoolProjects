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
        Node aNode = new Node();
        aNode.data = element;
        aNode.next = first;
        first = aNode;       
    }

    /** 
     * Removes the first element in the linked list and returns it.
     * Throw NoSuchElementException if the list is empty.
     */
    public Object removeFirst() {
        if (first == null) {
            throw new NoSuchElementException();
        }
        // read the data
        Object element = first.data;

        // move head to the next node
        first = first.next;
        return element;   
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