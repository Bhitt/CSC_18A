/* Slime class that - derives from the Enemy class
 *                  - has unique stats
 *                  - displays an ascii picture of itself
 *                  - displays a string for its attack
 * 
 */

package haunted_house;

//library imports
//import java.awt.Color;
import java.awt.Font;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

/**
 *
 * 
 */
public class Slime extends Enemy{
    //**********************************************************
    //             Default Constructor
    //**********************************************************
    Slime(){
        super("Slime",(2+Game.getInstance().getCurHealthModifier()),(2+Game.getInstance().getCurDamageModifier()));
    }
    
    //**********************************************************
    //             Ascii Art
    //**********************************************************
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
    
    
    //**********************************************************
    //             Attack String
    //**********************************************************
    @Override
    public void printYoAttack() {
         StringBuilder output = new StringBuilder();
            output.append("The slime tries to swallow you whole!\n")
                  .append("It hits for ").append(this.getAttackValue()).append(" damage!\n");
            JOptionPane.showMessageDialog(null,output);
    }
    
}
