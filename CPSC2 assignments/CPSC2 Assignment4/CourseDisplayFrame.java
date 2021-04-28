import javax.swing.*;
import java.util.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.Scanner;
public class CourseDisplayFrame extends JFrame {
    // instance variables
    private JLabel courseCode, courseName, courseCredit, courseGrade;
    private JTextField codeField, nameField, creditField, gradeField;
    private JButton addCourse, sortByCode, sortByName, sortByGrade, resetInput;
    private JTextArea outputTextArea;
    private static final int FRAME_WIDTH = 500;
    private static final int FRAME_HEIGHT = 450;
    private static ArrayList<Course> courseList;
    private static Course course;
    public CourseDisplayFrame() {
        // add an ArrayList that stores the courses the user adds
        courseList = new ArrayList<Course>();
        // add Course Code text label and text field(width of 30)
        courseCode = new JLabel("Course Code: ");
        codeField = new JTextField(30);
        // add Course Name text label and text field(width of 30)
        courseName = new JLabel("Course Name: ");
        nameField = new JTextField(30);
        // add Course Credit text label and text field(width of 30)
        courseCredit = new JLabel("Course Credit: ");
        creditField = new JTextField(30);
        // add Course Grade text label and text field(width of 30)
        courseGrade = new JLabel("Course Grade: ");
        gradeField = new JTextField(30);        
        // add necessary buttons 
        addCourse = new JButton("Add Course");
        sortByCode = new JButton("Sort By Code");
        sortByName = new JButton("Sort By Name");
        sortByGrade = new JButton("Sort By Grade");
        resetInput = new JButton("Reset Input");
        // add text area (row of 10 and column of 35)
        outputTextArea = new JTextArea(10,35);
        // initialize text area with headings
        outputTextArea.setText("     Code            Name           Credit              Grade");
        // add a scrollpane that includes the text area
        JScrollPane pane = new JScrollPane(outputTextArea);
        // create a JPanel
        JPanel panel = new JPanel();
        // set up addCourse and listener
        ActionListener addCourseData = new AddCourseListener();
        addCourse.addActionListener(addCourseData);
        // set up resetInput and listener
        ActionListener resetData = new ResetInputListener();
        resetInput.addActionListener(resetData);
        // set up sortByCode and listener
        ActionListener sortCode = new SortByCodeListener();
        sortByCode.addActionListener(sortCode);
        // set up sortByName and listener
        ActionListener sortName = new SortByNameListener();
        sortByName.addActionListener(sortName);
        // set up sortByGrade and listener
        ActionListener sortGrade = new SortByGradeListener();
        sortByGrade.addActionListener(sortGrade);
        // add Course Code text label and text field to panel
        panel.add(courseCode);
        panel.add(codeField);
        // add Course Name text label and text field to panel
        panel.add(courseName);
        panel.add(nameField);
        // add Course Credit text label and text field to panel
        panel.add(courseCredit);
        panel.add(creditField);
        // add Course Grade text label and text field to panel
        panel.add(courseGrade);
        panel.add(gradeField);
        // add all buttons to panel
        panel.add(addCourse);
        panel.add(sortByCode);
        panel.add(sortByName);
        panel.add(sortByGrade);
        panel.add(resetInput);
        // add the scrollpane to the panel
        panel.add(pane);
        // add the panel to the frame
        add(panel);
        //set the frame size
        setSize(FRAME_WIDTH, FRAME_HEIGHT);
    }

    class AddCourseListener implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            try {
                // get the inputed class code from the field
                String code = codeField.getText();
                // get the inputed class name from the field 
                String name = nameField.getText();
                // get the inputed class credit from the field and make sure that it is an integer
                int credit = Integer.parseInt(creditField.getText());
                // get the inputed class grade from the field
                String grade = gradeField.getText();
                // if any fields are left empty print an error message
                if (code.equals("") || name.equals("") || grade.equals("")) {
                    System.out.println("Invalid course entered: check all fields and try again.");
                } else {
                    // set these above variables as Course object parameters
                    course = new Course(code, name, credit, grade);
                    // add this data to the ArrayList of Course objects
                    courseList.add(course);
                    // print the data in the output text area
                    outputTextArea.append("\n" + course);
                }
            } catch (NumberFormatException e) {
                // if a non-integer credit value is inputted print an error message
                System.out.println("Invalid course entered: check all fields and try again.");
            } finally {
                // clear fields for next input
                codeField.setText("");
                nameField.setText("");
                creditField.setText("");
                gradeField.setText("");
            }
        }            
    }

    class SortByCodeListener implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            // sort the class info by code in ascending order 
            Collections.sort(courseList, new courseCodeAscending()); 
            // make sure the output text area has the class info categories
            outputTextArea.setText("     Code            Name           Credit              Grade");
            // print the sorted classes by code from the arrayList
            for (Course element : courseList) {
                outputTextArea.append("\n" + element.toString());
            }
        }            
    }

    class SortByNameListener implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            // sort the class info by name in ascending order 
            Collections.sort(courseList, new courseNameAscending());
            // make sure the output text area has the class info categories
            outputTextArea.setText("     Code            Name           Credit              Grade");
            // print the sorted classes by name from the arrayList
            for (Course element : courseList) {
                outputTextArea.append("\n" + element.toString());
            }
        }            
    }

    class SortByGradeListener implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            // sort the class info by grade in ascending order 
            Collections.sort(courseList, new courseGradeAscending());
            // make sure the output text area has the class info categories
            outputTextArea.setText("     Code            Name           Credit              Grade");
            // print the sorted classes by grade from the arrayList
            for (Course element : courseList) {
                outputTextArea.append("\n" + element.toString());
            }
        }            
    }

    class ResetInputListener implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            // when the resetInput button is clicked, clear the output text area besides the category info
            courseList.clear();
            outputTextArea.setText("     Code            Name           Credit              Grade");
        }            
    }
}