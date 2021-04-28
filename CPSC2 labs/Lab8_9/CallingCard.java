public class CallingCard extends Card {
    // declare instance variable(s)
    private String cardNumber;
    private String pin;
    // constuctor
    public CallingCard(String n, String cardNum, String pinNum) {
        // the name variable is from the card class so you must use superclass constructor
        super(n);
        // set cardNumber equal to cardNum parameter
        cardNumber = cardNum;
        // set pin equal to pinNum parameter
        pin = pinNum;    
    }
    // method to print out Callingcard holder's name + cardNumber + pin
    public String format() {
        // uses the superclass format method for the card name and then adds cardNumber + pin 
        return super.format() + "\nCard Number: " + cardNumber  + "\nPin Number: " + pin;
    } 
}
