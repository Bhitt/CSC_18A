/* Zombie class that - derives from the Enemy class
 *                   - has unique stats
 *                   - displays an ascii picture of itself
 *                   - displays a string for its attack
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
    //A skeleton but with more stuff
    //**********************************************************
    //             Default Constructor
    //**********************************************************
    Zombie(){
        super("Zombie",(8+Game.getInstance().getCurHealthModifier()),(8+Game.getInstance().getCurDamageModifier()));
    }
    
    //**********************************************************
    //             Ascii Art
    //**********************************************************
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

    //**********************************************************
    //             Attack String
    //**********************************************************
    @Override
    public void printYoAttack() {
         StringBuilder output = new StringBuilder();
            output.append("The zombie rushes out and bites you!\n")
                  .append("It hits for ").append(this.getAttackValue()).append(" damage!\n");
            JOptionPane.showMessageDialog(null,output);
    }
    
}
