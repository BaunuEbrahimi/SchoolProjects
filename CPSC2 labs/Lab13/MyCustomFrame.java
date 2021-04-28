import javax.swing.*;
import java.awt.event.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class MyCustomFrame extends JFrame {
    // instance variables for button, label, rateField, area and frame size constants
    private JButton button;
    private JLabel label;
    private JTextField rateField;
    private JTextArea area;
    private final int FRAME_WIDTH = 800;
    private final int FRAME_HEIGHT = 800;

    // ClickListener as an inner class
    public class ClickListener implements ActionListener{  
        public void actionPerformed(ActionEvent e) {  
            // create a variable of the rateField text
            String field = rateField.getText();
            // when the button is clicked append the rateField text to the area
            area.append(field + "||"); 
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
        // create a JTextField object
        rateField = new JTextField();
        // initialize the rateField to an empty string
        rateField.setText("");
        // create a JTextArea, initialize the JTextArea to "||"
        area = new JTextArea("||");
        // invoke the addActionListener to the button
        button.addActionListener(listener);
        // add the button to the panel
        panel.add(button);
        // add the label to the panel
        panel.add(label);
        // add the rateField to the panel
        panel.add(rateField);
        // add the area to the panel
        panel.add(area);
        // add the panel
        add(panel);
    }
}
