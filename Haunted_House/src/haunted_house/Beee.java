/*Bee class that - derives from the Enemy class
 *               - has unique stats
 *               - displays an ascii picture of itself
 *               - displays a string for its attack
 * 
 */
package haunted_house;

//library imports
import java.awt.Font;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

/**
 *
 * @author bhitt
 */
public class Beee extends Enemy {
    //**********************************************************
    //             Default Constructor
    //**********************************************************
    Beee(){
        super("Beee",3,3);
    }
    
    //**********************************************************
    //             Ascii art
    //**********************************************************
    @Override
    public void printYoSelf() {
        StringBuilder output = new StringBuilder();
            output.append("                 \\     /\n")
                  .append("             \\    o ^ o    /\n")
                  .append("               \\ (     ) /\n")
                  .append("    ____________(%%%%%%%)_____________\n")
                  .append("   (     /   /  )%%%%%%%(  \\   \\     )\n")
                  .append("   (___/___/__/           \\__\\___\\___)\n")
                  .append("      (     /  /(%%%%%%%)\\  \\     )\n")
                  .append("       (__/___/ (%%%%%%%) \\___\\__)\n")
                  .append("               /(       )\\\n")
                  .append("             /   (%%%%%)   \\\n")
                  .append("                  (%%%)\n")
                  .append("                    !\n");
            
            JTextArea tArea = new JTextArea(1, 1);
            tArea.setFont(new Font(Font.MONOSPACED, Font.BOLD, 20));
            tArea.setText(output.toString());
            //tArea.setBackground(Color.lightGray);
            //tArea.setForeground(Color.GREEN);
            JOptionPane.showMessageDialog(null, tArea, "Beee!!", JOptionPane.PLAIN_MESSAGE);
    }
    
    //**********************************************************
    //             Attack String
    //**********************************************************
    @Override
    public void printYoAttack() {
        StringBuilder output = new StringBuilder();
            output.append("This Beee throws its stingers at you!!!\n")
                  .append("It hits for ").append(this.getAttackValue()).append(" damage!\n");
            JOptionPane.showMessageDialog(null,output);
    }
    
}
