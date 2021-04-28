import javax.swing.*;
import java.awt.*;
public class Lab11_1 {
    public static void main(String[] args) {
        // create frame object
        JFrame frame = new JFrame();
        // set frame size: height and width
        frame.setSize(800,800);
        // give the frame a title
        frame.setTitle("My First Frame");
        // have the frame exit when closed 
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // set visibility (true = is visible)
        frame.setVisible(true);
    }
}
