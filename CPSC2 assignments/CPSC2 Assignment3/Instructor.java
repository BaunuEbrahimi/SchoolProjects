public class Instructor extends Person implements Comparable<Instructor> {
    // declare instance variable(s)
    private double salary;
    // constructor
    public Instructor(String name, int age, double salary) {
        super(name, age);
        this.salary = salary;
    }

    // accessor method(s)
    public double getSalary() {
        return this.salary;
    }

    // mutator method(s)
    public void setSalary(double salary) {
        this.salary = salary;
    }

    // overriding method
    public String toString() {
        String strSalary = String.format("%10.2f", this.salary);  
        return super.toString() + "\t   " + "Salary: " + strSalary;
    }   

    public int compareTo(Instructor instructor1) {
        /* put the instructor salaries in ascending order, if the object comes
        before the other one return negative */
        if (salary < instructor1.salary) {
            return -1;
        } else if (salary > instructor1.salary) {
            return 1;
        } else { 
            return 0;
        }
    }
}