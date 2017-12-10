/* Skeleslime class that - derives from the Enemy class
 *                       - has unique stats
 *                       - displays an ascii picture of itself
 *                       - displays a string for its attack
 * 
 */

package haunted_house;
//library imports
import java.awt.Font;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

/**
 *
 * @author ncc
 */
public class Skeleslime extends Enemy{
    //**********************************************************
    //             Default Constructor
    //**********************************************************
    Skeleslime(){
        super("SkeleSlime",(15+Game.getInstance().getCurHealthModifier()),(15+Game.getInstance().getCurDamageModifier()));
    }
    
    //**********************************************************
    //             Ascii Art
    //**********************************************************
    @Override
    public void printYoSelf(){
        StringBuilder output = new StringBuilder();
            output.append(  "        __.,,------.._\n" +
                            "     ,'\"   _      _   \"`.\n" +
                            "    /.__, ._  -=- _\"`    Y\n" +
                            "   (.____.-.`      \"\"`   j\n" +
                            "    VvvvvvV`.Y,.    _.,-'       ,     ,     ,\n" +
                            "        Y    ||,   '\"\\         ,/    ,/    ./\n" +
                            "        |   ,'  ,     `-..,'_,'/___,'/   ,'/   ,\n" +
                            "   ..  ,;,,',-'\"\\,'  ,  .     '     ' \"\"' '--,/    .. ..\n" +
                            " ,'. `.`---'     `, /  , Y -=-    ,'   ,   ,. .`-..||_|| ..\n" +
                            "ff\\\\`. `._        /f ,'j j , ,' ,   , f ,  \\=\\ Y   || ||`||_..\n" +
                            "l` \\` `.`.\"`-..,-' j  /./ /, , / , / /l \\   \\=\\l   || `' || ||...\n" +
                            " `  `   `-._ `-.,-/ ,' /`\"/-/-/-/-\"'''\"`.`.  `'.\\--`'--..`'_`' || ,\n" +
                            "            \"`-_,',  ,'  f    ,   /      `._    ``._     ,  `-.`'//         ,\n" +
                            "          ,-\"'' _.,-'    l_,-'_,,'          \"`-._ . \"`. /|     `.'\\ ,       |\n" +
                            "        ,',.,-'\"          \\=) ,`-.         ,    `-'._`.V |       \\ // .. . /j\n" +
                            "        |f\\\\               `._ )-.\"`.     /|         `.| |        `.`-||-\\\\/\n" +
                            "        l` \\`                 \"`._   \"`--' j          j' j          `-`---'\n" +
                            "         `  `                     \"`_,-','/       ,-'\"  /\n" +
                            "                                 ,'\",__,-'       /,, ,-'\n" +
                            "                                 Vvv'            VVv'");
            
            JTextArea tArea = new JTextArea(1, 1);
            tArea.setFont(new Font(Font.MONOSPACED, Font.PLAIN, 20));
            tArea.setText(output.toString());
            JOptionPane.showMessageDialog(null, tArea, " SKELESLIME!!!!!", JOptionPane.PLAIN_MESSAGE);
    }
    
    //**********************************************************
    //             Attack string
    //**********************************************************
    @Override
    public void printYoAttack() {
         StringBuilder output = new StringBuilder();
            output.append("The Skeleslime swings a green gelatanous arm at you!\n")
                  .append("It hits for ").append(this.getAttackValue()).append(" damage!\n");
        JOptionPane.showMessageDialog(null,output);
    }
}
