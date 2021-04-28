public class DriverLicense extends IDCard {
    // declare instance variable(s)
    private int expirationYear; 
    // constructor
    public DriverLicense(String n, String id, int cardExpirationYear) {
        // the name variable is from the card class so you must use superclass constructor
        super(n, id);
        // set expirationYear equal to cardExpirationYear parameter
        expirationYear = cardExpirationYear;
    }
    // method to print out DriverLicense holder's name + card expirationYear
    public String format() {
        // uses the superclass format method for the card name and then adds expirationYear
        return super.format() + "\nExpiration Year: " + expirationYear;
    }
}
