/*
 * Lab 8:   Creating Card Class
 * Programmer:  Baunu Ebrahimi
 */
public class Card {
    // declare instance variable(s)
    private String name;
    // default constructor
    public Card() {
        // set name equal to empty string
        name = "";
    }    
    // non-default constructor
    public Card(String n) {
        // set name equal to n parameter
        name = n;
    }
    // getter method(s)
    public String getName() {
        return name;
    }
    // method to tell wether card is expired
    public boolean isExpired() {
        return false;
    }
    // method to print out card holder's name
    public String format() {
        return "Card holder: " + name;
    }
}