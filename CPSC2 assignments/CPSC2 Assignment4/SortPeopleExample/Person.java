import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;

public  class Person {
    public String name;
    public int id;
    public Date hireDate;

    public Person(String iname, int iid, Date ihireDate) {
        name = iname;
        id = iid;
        hireDate = ihireDate;
    }

    public String toString() {
        return String.format("%-10s%-6d%30s", name, id, hireDate.toString());
    }
}

// Comparator
class CompId implements Comparator<Person> {
    @Override
    public int compare(Person arg0, Person arg1) {
        return arg0.id - arg1.id;
    }
}

class CompDateAscending implements Comparator<Person> {
    @Override
    public int compare(Person arg0, Person arg1) {
        return arg0.hireDate.compareTo(arg1.hireDate);
    }
}

class CompDateDescending implements Comparator<Person> {
    @Override
    public int compare(Person arg0, Person arg1) {
        return -1 * arg0.hireDate.compareTo(arg1.hireDate);
    }
}
