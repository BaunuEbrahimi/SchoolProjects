import javax.swing.*;
import java.awt.event.*;
public class MyCustomFrame extends JFrame {
    // instance variables for button, label, and frame size constants
    private JButton button;
    private JLabel label;
    private final int FRAME_WIDTH = 800;
    private final int FRAME_HEIGHT = 800;

    // ClickListener as an inner class
    public class ClickListener implements ActionListener{  
        public void actionPerformed(ActionEvent e) {
            // when the button is clicked print message
            System.out.println("Button was clicked.");      
        }
    }

    public MyCustomFrame() {
        // call components method
        createComponents();
        // set the frame size
        setSize(FRAME_WIDTH, FRAME_HEIGHT);

    }

    private void createComponents() {
        // create an action listener object
        ActionListener listener = new ClickListener();
        // create a JButton object  
        button = new JButton("button");
        // create a JLabel object
        label = new JLabel("label");
        // create a JPanel object
        JPanel panel = new JPanel();
        // invoke the addActionListener to the button
        button.addActionListener(listener);
        // add the button to the panel
        panel.add(button);
        // add the label to the panel
        panel.add(label);
        // add the panel
        add(panel);
    }
}
