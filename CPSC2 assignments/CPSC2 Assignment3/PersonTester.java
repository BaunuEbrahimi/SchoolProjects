import java.io.*;
import java.util.Scanner;
import java.util.Arrays;
public class PersonTester {
    public static void main(String[] args) throws FileNotFoundException {
        // open and read from file "data1.txt"
        File filename = new File("data1.txt");
        Scanner scan = new Scanner(filename);
        // get the array size from the first line of the file 
        String arraySize = scan.nextLine();
        // create a new array of the size found in the first line of the file
        Student [] students = new Student[Integer.parseInt(arraySize)];
        int position = 0;
        // while the file has a next line
        while(scan.hasNextLine()) {
            // get the contents of the first line
            String line = scan.nextLine();
            // get rid of any excess spaces between line data
            line = line.replaceAll("\\s+", " ");
            // split the data by a single space
            String[] splitStudentData = line.split(" "); 
            /* create a Student object and put the student name located in 
            splitStudentData at position 0, the student age at position 1, the student 
            ID at position 2 and the student major at position 3, as the parameters */
            Student studentData = new Student(splitStudentData[0], Integer.parseInt(splitStudentData[1]), splitStudentData[2],splitStudentData[3]);
            // add this data into the array
            students[position] = studentData;
            // update array position at each new line
            position++;
        }

        // sort the array according to studentID
        Arrays.sort(students);
        // print out the sorted array data
        System.out.println("A List students sorted by studentID: ");
        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i]);
        }

        System.out.println("");

        // open and read from file "data2.txt"
        File filename2 = new File("data2.txt");
        Scanner scan2 = new Scanner(filename2);
        // get the array size from the first line of the file
        String arraySize2 = scan2.nextLine();
        // create a new array of the size found in the first line of the file
        Instructor [] instructors = new Instructor[Integer.parseInt(arraySize2)];        
        int position2 = 0;
        while(scan2.hasNextLine()) {
            // get the contents of the first line
            String line2 = scan2.nextLine();
            // get rid of any excess spaces between line data
            line2 = line2.replaceAll("\\s+", " ");
            // split the data by a single space
            String[] splitInstructorData = line2.split(" ");
            /* create an Instructor object and put the instructor name located in 
            splitInstructorData at position 0, the instructor age at position 1, and the instructor 
            salary at position 2, as the parameters */
            Instructor instructorData = new Instructor(splitInstructorData[0], Integer.parseInt(splitInstructorData[1]), Double.parseDouble(splitInstructorData[2]));
            // add this data into the array
            instructors[position2] = instructorData;
            // update array position at each new line
            position2++;
        }

        // sort the array according to instructor salary
        Arrays.sort(instructors);
        // print out the sorted array data
        System.out.println("A List of instructors sorted by salary: "); 
        for(int i = 0; i < instructors.length; i++) {
            System.out.println(instructors[i]);
        }

        // close both files
        scan.close();
        scan2.close();
    }
}