public class IDCard extends Card {
    // declare instance variable(s)
    private String idNumber;
    // constructor
    public IDCard(String n, String id) {
        // the name variable is from the card class so you must use superclass constructor
        super(n);
        // set idNumber equal to is parameter
        idNumber = id;
    }
    // method to print out IDcard holder's name + idNumber
    public String format() {
        // uses the superclass format method for the card name and then adds id number
        return super.format() + "\nID Number: " + idNumber;
    }    
}
