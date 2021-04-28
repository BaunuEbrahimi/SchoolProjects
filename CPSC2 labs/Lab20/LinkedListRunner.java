public class LinkedListRunner {
    public static void main(String[] args) {
        // create a linked list object
        LinkedList myList = new LinkedList();
        // add items
        myList.addFirst("aaa");
        myList.addFirst("bbb");
        myList.addFirst("ccc");
        myList.addFirst("ddd");
        // print the list after items were added
        System.out.println("List after adding items: \n" + myList);
        // remove items
        System.out.println("Removed element:  " + myList.removeFirst());
        System.out.println("Removed element:  " + myList.removeFirst());
        // print the list after items were removed
        System.out.println("\nList after removing items: \n" + myList);
    }
}