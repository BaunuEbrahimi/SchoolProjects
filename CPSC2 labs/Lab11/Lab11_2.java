import javax.swing.*;
import java.awt.*;
public class Lab11_2 {
    public static void main(String[] args) {
        // create frame object 
        JFrame frame = new JFrame();
        // set frame size: height and width
        frame.setSize(800,800);
        // create panel object
        JPanel panel = new JPanel();
        // set the panel color to red
        panel.setBackground(Color.RED);
        // create a button object labeled button
        JButton button = new JButton("button");
        // create a label labeled label
        JLabel label = new JLabel("label");
        // add the button to the panel
        panel.add(button);
        // add the label to the panel
        panel.add(label);
        // add the panel to the frame
        frame.add(panel);
        // have the frame exit when closed 
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // set visibility (true = is visible)
        frame.setVisible(true);
    }
}
