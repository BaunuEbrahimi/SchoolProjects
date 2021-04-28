/*    A class to test the Door class.  */
public class DoorTester {
    /*   Tests the methods of the Door class       
    @param args not used    */  
    public static void main(String[] args) {
        // created a door called "frontDoor" with a state of "open"
        Door frontDoor = new Door("Front", "open");
        // get the state of the front door
        System.out.println("The Front door is " + frontDoor.getState());
        // it should be open
        System.out.println("Expected: open\n");

        // created a second Door object called “backDoor” with an initial state of "closed"
        Door backDoor = new Door("Back", "closed");
        // get the state of the back door
        System.out.println("The Back door is " + backDoor.getState());
        System.out.println("Expected: closed\n");
        System.out.println("Now lets change the state of the Back door: ");
        // set the state of the back door to open
        backDoor.setState("open"); 
        // get the state of the back door again
        System.out.println("The Back door is now " + backDoor.getState());
        System.out.println("Expected: open\n");

        // created a third Door object called “sideDoor” with an initial state of "open"
        Door sideDoor = new Door("Side", "open");
        // get the state of the side door
        System.out.println("The Side door is " + sideDoor.getState());
        System.out.println("Expected: open\n");
        System.out.println("Now lets change the name of the Side door: ");
        // set the name of the side door to Front
        sideDoor.setName("Front");
        // get the state of the side door again
        System.out.println("The Side door is now named the " + sideDoor.getName() + " door");
        System.out.println("Expected: Front\n");
    }
}
