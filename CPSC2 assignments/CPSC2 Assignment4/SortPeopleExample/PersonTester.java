import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;


public class PersonTester {

    public static void main(String[] args) {
        
        // TODO Auto-generated method stub
        SimpleDateFormat df = new SimpleDateFormat("mm-dd-yyyy");
        ArrayList<Person> people;
        people = new ArrayList<Person>();
        try {
            people.add(new Person("Joe", 92422, df.parse("12-12-2010")));
            people.add(new Person("Joef", 24122, df.parse("1-12-2010")));
            people.add(new Person("Joee", 24922, df.parse("12-2-2010")));
        } catch (ParseException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        // sort based on ID and then print out
        Collections.sort(people, new CompId());
        System.out.println("BY ID");
        for (Person p : people) {
            System.out.println(p.toString());
        }

        // sort by Date Ascending order, and then print out
        Collections.sort(people, new CompDateAscending());
        System.out.println("\nBY Date asc");
        for (Person p : people) {
            System.out.println(p.toString());
        }
        
        // sort by Date Descending order, and then print out
        Collections.sort(people, new CompDateDescending());
        System.out.println("\nBY Date desc");
        for (Person p : people) {
            System.out.println(p.toString());
        }
    }

}