import javax.swing.*;
public class MyCustomFrameViewer {
    public static void main(String[] args) {
        // create a MyCustomFrame object
        MyCustomFrame frame = new MyCustomFrame();
        // set the title of the frame
        frame.setTitle("My first frame");
        // set the default close operation to exit on close
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // set visibility
        frame.setVisible(true);
    }
}

