// create a cat class that implements Speakable
public class Cat implements Speakable {
    // declare private instant variable(s)
    private String name;
    // create constructor
    public Cat(String name) {
        this.name = name;
    }
    // create a speak() method
    public void speak() {
        System.out.println("Meow! Meow!");
    }
    // create a method to print cat info
    public String toString() {
        return "Cat:  " + name;
    }
}