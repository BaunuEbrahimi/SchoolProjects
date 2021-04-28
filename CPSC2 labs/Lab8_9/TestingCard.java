// Lab 9: tests Card class
public class TestingCard {
    public static void main(String[] args) {
        // created an IDCard object and passed in a name and idnumber
        IDCard id = new IDCard("Bob", "23 777 888");
        
        // created a Calling card object and passed in a name, card number, and pin 
        CallingCard cardInfo = new CallingCard("Jenn", "1234 5678 9012 3456", "5648");
        
        // created a driversCard object and passed in a name, and expiration year
        DriverLicense driversCard = new DriverLicense("Jamie","23 777 888", 2025);
        
        // print out IdCard info using format method:
        System.out.println("ID Card: ");
        System.out.println(id.format() + "\n");
        
        // print out CallingCard info using format method:
        System.out.println("Calling Card: ");
        System.out.println(cardInfo.format() + "\n");
        
        // print out driversLicense info using format method:
        System.out.println("Driver License: ");
        System.out.println(driversCard.format() + "\n");        
    }
}
