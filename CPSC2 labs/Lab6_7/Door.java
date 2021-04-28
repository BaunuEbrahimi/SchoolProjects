//6.1 creating a Door class
public class Door {
    //6.2 created private String instance variables
    private String name;
    private String state;
    //6.4 created a constructor
    public Door(String newName, String newState) {
        // set the name variable equal to the newName parameter 
        name = newName;
        // set the state variable equal to the newState parameter 
        state = newState;
    }
    //6.3 added methods
    // changes the state of the door to open
    public String Open() {
        state = "open";
        return state;
    }
    // changes the state of the door to closed
    public String Closed() {
        state = "closed";
        return state;
    }
    //6.5 added accessor methods
    public String getName() {
        // returns the name of the door
        return name;
    }
    
    public String getState() {
        // returns the state of the door
        return state;
    }
    //6.6 added mutator methods
    // sets the name of the door
    public void setName(String newName){
        name = newName;
    }
    // sets the state of the door
    public void setState(String newState) {
        state = newState;
    }   
}
