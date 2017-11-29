/* Slime class that - derives from the Enemy class
 *                  - has unique stats
 *                  - displays an ascii picture of itself
 * 
 */

package haunted_house;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

/**
 *
 * 
 */
public class Slime extends Enemy{
   String type;
    Integer health;
    Integer attackValue;
    
    @Override
    public void printYoSelf(){
        StringBuilder output = new StringBuilder();
            output.append("             _._._\n")
                  .append("           .'    /\n")
                  .append("          / ~  ~ \\\n")
                  .append("         |  o  o  |\n")
                  .append("        (    ..    )\n")
                  .append("        /    __    \\\n")
                  .append("   __..(    (__)    )..__\n")
                  .append("-'' (   '--.____.--'   ) ''-\n");
            
            JTextArea tArea = new JTextArea(1, 1);
            tArea.setFont(new Font(Font.MONOSPACED, Font.BOLD, 20));
            tArea.setText(output.toString());
            //tArea.setBackground(Color.lightGray);
            //tArea.setForeground(Color.GREEN);
            JOptionPane.showMessageDialog(null, tArea, " SLIME!", JOptionPane.PLAIN_MESSAGE);
    }
    
    public String getType(){
        return this.health;
    }
    
    public Integer getHealth(){
        return this.health;
    }
    
    public Integer getAttackValue(){
       System.out.println("The slime tries to swallow you whole!");
        return this.attackValue;   
    }
    
}
