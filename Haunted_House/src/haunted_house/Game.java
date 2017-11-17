/* Game class that  - implements the actions of the game
 *                  - display story
 *                  - saves states
 *
 */

package haunted_house;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import javax.swing.JOptionPane;

/**
 *
 * @author ncc
 */
public class Game {
    private Player player;
    private static final String FILENAME = "HighScores.csv";
    //public static Game _instance;
    
    public Game(){
        //create the player
        player = new Player();
        
        showStats();
        //welcome the player and output the stats
        
        
        
        //save the highscore (currently test case)
        //saveHighScore();
    }
    
    //second constructor to load in a previous game
    
//    public static Game getInstance(){
//        if(_instance != null){
//            return _instance;
//        }else{
//            _instance = new Game();
//            return _instance;
//        }
//    }
    public void showStats(){
        StringBuilder output = new StringBuilder();
        output.append(player.getName() + "\n" )
              .append("Current HP: " + player.getCurrentHealth() + "\n")
              .append("Attack Power: " + player.getAttackVal());
        
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
