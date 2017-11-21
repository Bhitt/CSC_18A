/* Game class that  - implements the actions of the game
 *                  - display story
 *                  - saves states
 *
 */

package haunted_house;

import java.awt.Font;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

/**
 *
 * @author ncc
 */
public class Game {
    //private Player player;
    private static final String FILENAME = "HighScores.csv";
    public static Game _instance;
    
    private Game(){
        //default constructor for singleton Game object
        
    }
    
    public void setNewGame(){
        Player.getInstance().promptName();
        showStats();
    }
    
    public boolean gameLoop(){
        boolean exit = false;
        //continue the loop until gameplay is ended (death or exitting)
        do{
            //enter into a room (build it)
    
            //spawn enemies
        
            //loop through enemies for fight
        
            //give rewards if alive
        
            //check for save point if alive
        
            //check for death
            
        }while(!exit);
        
        //return true for death or false for alive and exiting through save
        return true;
    }
    
    
    public void testFunction(){
    //

    }
    public static Game getInstance(){
        if(_instance != null){
            return _instance;
        }else{
            _instance = new Game();
            return _instance;
        }
    }
    public void showStats(){
        StringBuilder output = new StringBuilder();
        output.append(Player.getInstance().getName() + "\n" )
              .append("Current HP: " + Player.getInstance().getCurrentHealth() + "\n")
              .append("Attack Power: " + Player.getInstance().getAttackVal());
        
        JOptionPane.showMessageDialog(null, output, "Player Status", JOptionPane.PLAIN_MESSAGE);
    }
    public void spawnRoom(){
        
    }
    
    public void spawnEnemy(){
        
    }
    
    public void saveHighScore(){
        BufferedWriter bw =null;
        FileWriter fw = null;
        boolean addHeader = false;
        
        try {
            String data = "Branden, 57843\n";
            
            File file = new File(FILENAME);
            
            //If the file doesn't exist, then create it
            if(!file.exists()){
                addHeader = true;
                file.createNewFile();
                
            }
            
            //true = append file
            fw = new FileWriter(file.getAbsoluteFile(),true);
            bw = new BufferedWriter(fw);
            
            if(addHeader) bw.write("PLAYER NAME,SCORE\n");
            bw.write(data);
            
            System.out.println("Data saved to a file.");
            
        } catch(IOException e){
            e.printStackTrace();
            
        } finally {
            try {
                if (bw != null) bw.close();
                if (fw != null) fw.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }
    
    
    ///
}
