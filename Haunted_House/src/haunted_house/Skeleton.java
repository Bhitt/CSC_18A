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
    //**********************************************************
    //             Default Constructor
    //**********************************************************
    Skeleton(){
        super("Skeleton",(5*Game.getInstance().getCurHealthModifier()),(5*Game.getInstance().getCurDamageModifier()));
    }
    
    //**********************************************************
    //             Display a skeleton to the screen
    //**********************************************************
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

    @Override
    public void printYoAttack() {
         StringBuilder output = new StringBuilder();
            output.append("The skeleton swings his old, rusty sword at you!\n")
                  .append("It hits for ").append(this.getAttackValue()).append(" damage!\n");
            JOptionPane.showMessageDialog(null,output);
    }

}
