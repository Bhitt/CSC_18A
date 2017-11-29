/* Zombie class that - derives from the Enemy class
 *                   - has unique stats
 *                   - displays an ascii picture of itself
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
public class Zombie extends Enemy{
    //String type;
    //Integer health;
    //Integer attackValue;
    
    @Override
    public void printYoSelf(){
        StringBuilder output = new StringBuilder();
            output.append("         .wwww. \n")
                  .append("        | _  _ | \n")
                  .append("!!!!    | O  o |     \\\\\\\\\n")
                  .append("!||!_/  (_ -- _)   \\_!||!\n")
                  .append("\\   /    |.--.|     \\   /\n")
                  .append(" ) |     ||__||      ) /\n")
                  .append(" | | _.--'.__.'--._ / /\n")
                  .append(" \\  '              ' /");
            
            JTextArea tArea = new JTextArea(1, 1);
            tArea.setFont(new Font(Font.MONOSPACED, Font.BOLD, 20));
            tArea.setText(output.toString());
            JOptionPane.showMessageDialog(null, tArea, " ZOMBIE!", JOptionPane.PLAIN_MESSAGE);
    }
    
    @Override
    public String getType(){
       return this.type;
    }
    
    @Override
    public Integer getHealth(){
       return this.health;
    }
    
    @Override
    public Integer getAttackValue(){
       System.out.println("The zombie rushes out and bites you!");
       return this.attackValue;   
    }
    
}
