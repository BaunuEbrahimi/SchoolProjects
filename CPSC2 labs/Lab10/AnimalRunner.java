import java.util.*;
// create unit tester
public class AnimalRunner {  
    public static void main(String[] args) {
        // create an ArrayList of Speakable objects
        ArrayList<Speakable> dogcatList  = new ArrayList<Speakable>();
        // add a dog object to the ArrayList
        dogcatList.add(new Dog("Fred"));
        // add a cat object to the ArrayList
        dogcatList.add(new Cat("Wanda"));
        // using an enhanced for loop of Speakable objects...
        for (Speakable speakable : dogcatList) {
            // invoke the .speak() method on all of the objects in the dogcatList
            speakable.speak();
        }
    }  
}
// yes object works!

