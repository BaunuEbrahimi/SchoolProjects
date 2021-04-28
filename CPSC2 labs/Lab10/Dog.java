// create a dog class that implements Speakable
public class Dog implements Speakable {
    // declare private instant variable(s)
    private String name;
    // create constructor
    public Dog(String name) {
        this.name = name;
    }
    // create a speak() method
    public void speak() {
        System.out.println("Woof! Woof!");
    }
    // create a method to print dog info
    public String toString() {
        return "Dog:  " + name;
    }
}