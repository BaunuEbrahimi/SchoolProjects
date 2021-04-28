import javax.swing.*;
public class CourseDisplayViewer {
    public static void main(String[] args) {
        // create customized frame object
        JFrame frame = new CourseDisplayFrame();
        // set the title of the frame
        frame.setTitle("My Course Display Frame");
        // set the default close operation for the frame (exit on close)
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // set visibility to true
        frame.setVisible(true);
    }
}