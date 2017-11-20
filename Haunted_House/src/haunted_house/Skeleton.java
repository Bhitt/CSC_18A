/* Skeleton class that - derives from the Enemy class
 *                     - has unique stats
 *                     - displays an ascii picture of itself
 * 
 */

package haunted_house;

import java.awt.Font;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

/**
 *
 * 
 */
public class Skeleton extends Enemy {
    
    
    
    
    @Override
    public void printYoSelf(){
        StringBuilder output = new StringBuilder();
            output.append("       .-\"\"-. \n")
                  .append("      / _  _ \\\n")
                  .append("      |(_)(_)|\n")
                  .append("      (_ /\\ _)\n")
                  .append("       |wwww| \n")
                  .append("       \'-..-\' \n")
                  .append("/--------||--------\\");
            
            JTextArea tArea = new JTextArea(1, 1);
            tArea.setFont(new Font(Font.MONOSPACED, Font.BOLD, 20));
            tArea.setText(output.toString());
            JOptionPane.showMessageDialog(null, tArea, " SKELETON!", JOptionPane.PLAIN_MESSAGE);
    }
}
