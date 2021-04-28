public class Student extends Person implements Comparable<Student> {
    // declare instance variable(s)
    private String studentID;
    private String major;
    // constructor
    public Student(String name, int age, String studentID, String major) {
        super(name, age);
        this.studentID = studentID;
        this.major = major;
    }

    // accessor method(s)
    public String getStudentID() {
        return this.studentID;
    }

    public String getMajor() {
        return this.major;
    }

    // mutator method(s)
    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    // overriding method
    public String toString() {
        return super.toString() + "\t   " + "ID: " +  this.studentID + "\t" + "Major: " + this.major;
    }    

    public int compareTo(Student student1) {
        /* put the student IDs in ascending order, if the object comes
        before the other one return negative */
        if (studentID.compareTo(student1.studentID) < 0) {
            return -1;
        } else if (studentID.compareTo(student1.studentID) > 0) {
            return 1;
        } else { 
            return 0;
        }
    }
}