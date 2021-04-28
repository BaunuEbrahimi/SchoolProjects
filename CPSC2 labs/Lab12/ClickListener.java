import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/* (ClickListener Class prior to being turned into an inner class):
 * implement the ActionListener Interface */
public class ClickListener implements ActionListener{  
   public void actionPerformed(ActionEvent e) {
       // when the button is clicked print message
       System.out.println("Button was clicked.");      
   }
}