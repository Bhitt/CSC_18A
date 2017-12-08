/* Garden class that - derives from the Room class
 *                   - holds unique item spawn
 *                   - displays unique setting
 * 
 */

package haunted_house;

import java.awt.Font;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

/**
 *
 * @author ncc
 */
public class Garden extends Room{
    
    //**********************************************************
    //      Default Constructor 
    //**********************************************************
    Garden(){
        //set values
        type = "Garden";
        //print room greeting
        printGreeting();
        //spawn enemies into game
        Game.getInstance().spawnEnemy(new Beee());
        Game.getInstance().spawnEnemy(new Beee());
        Game.getInstance().spawnEnemy(new Beee());
        Game.getInstance().spawnEnemy(new Beee());
    }

    //**********************************************************
    //      Print Victory Statement 
    //**********************************************************
    @Override
    public void printVictory() {
        System.out.println("Jynkysss, you have defeated my swarm of Bees, how could you!!!!!!");
	System.out.println("Congrats you have found 3 hidden Items");
    }

    //**********************************************************
    //      Print Room Picture to Screen 
    //**********************************************************
    @Override
    public void printYoRoom() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    //**********************************************************
    //      Display text for greeting
    //**********************************************************
    @Override
    public void printGreeting() {
        StringBuilder output = new StringBuilder();
            output.append("Hello and Goodbye you foool, you have steped into the garden.\n")
                   .append("Now me and my beees shall be able to cut you into pieces.\n")
                   .append("I only have one question: how many years have you poisone the world with that ugly face?");
            JOptionPane.showMessageDialog(null, output);
    }
}
