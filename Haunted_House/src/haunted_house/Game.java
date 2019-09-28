/* Game class that  - implements the actions of the game
 *                  - display story
 *                  - saves states
 *                  - handles game loop (including fighting/room building/enemy fighting)
 *
 */

package haunted_house;


import java.awt.Color;
import java.awt.Font;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

/**
 *
 * @author ncc
 */
public class Game {
    //Game property
    public static Game _instance = null;
    private ArrayList<Enemy> enemies;
    private Random rand;
    private int curHealthModifier;
    private int curDamageModifier;
    private Room room;
    
    
    //**********************************************************
    //      Default Constructor for singleton game object
    //**********************************************************
    private Game(){
        this.enemies = new ArrayList();
        this.rand = new Random();
        this.curDamageModifier = 0;
        this.curHealthModifier = 0;
        
    }
    
    //**********************************************************
    //             Set up for a new Game
    //**********************************************************
    public void setNewGame(){
        //create a new character
        Player.getInstance().promptName();
        //reset modifiers
        this.curDamageModifier = 0;
        this.curHealthModifier = 0;
        //output the stats chosen
        showStats();
    }
    
    //**********************************************************
    //              Load a previous save game
    //**********************************************************
    public void loadGame(){
        //optional method
        
    }
    
    //**********************************************************
    //           Game loop that runs through game actions
    //**********************************************************
    public boolean gameLoop(){
        boolean exit = false;
        //continue the loop until gameplay is ended (death or exitting)
        do{
            //enter into a room (build it)
            spawnRoom();
            //show stats
            showStats();
            //loop through enemies for fight
            while(enemies.size()>0 && Player.getInstance().getCurrentHealth()>0){
                this.fightEnemy(enemies.get(0));
            }
            //increment damage modifier, health modifier, rooms cleared
            if(Player.getInstance().getCurrentHealth()>0){
                room.printVictory();
                this.curDamageModifier+=3;
                this.curHealthModifier+=3;
                Player.getInstance().setRoomsCleared(Player.getInstance().getRoomsCleared()+1);
            }
            //check for death
            if(Player.getInstance().getCurrentHealth()<=0){
                exit = true;
            }
        }while(!exit);
        //save death to file
        if(Player.getInstance().getCurrentHealth()<=0){
            //Create HighScoreIO object to add value to file
            HighScoreIO obituary = new HighScoreIO();
            obituary.addHighScore();
            //display Grave with name
            displayWake();
            //display High score table
            obituary.displayHighScores();
            //return true for death
            return true;
        }
        //return true for death or false for alive and exiting through save
        return false;
    }
    
    //**********************************************************
    //           Test function for testing purposes
    //**********************************************************
    public void testFunction(){
    //
        System.out.println("This is a test");
    }
    
    //**********************************************************
    //            Maintains game object as a singleton
    //**********************************************************
    public static Game getInstance(){
        if(_instance != null){
            //System.out.println("Game instance found");
            return _instance;
        }else{
            _instance = new Game();
            //System.out.println("Game instance created");
            return _instance;
        }
    }
    
    //**********************************************************
    //             Show the current game stats
    //**********************************************************
    public void showStats(){
        StringBuilder output = new StringBuilder();
        output.append(Player.getInstance().getName()).append("\n" )
              .append("Current HP: ").append(Player.getInstance().getCurrentHealth()).append("\n")
              .append("Attack Power: ").append(Player.getInstance().getAttackVal()).append("\n")
              .append("Enemy Heath/Damage Modifier: ").append(this.curDamageModifier).append("\n")
              .append("Rooms Cleared: ").append(Player.getInstance().getRoomsCleared());
        JOptionPane.showMessageDialog(null, output, "Player Status", JOptionPane.PLAIN_MESSAGE);
    }
    
    //**********************************************************
    //             Spawn a Room
    //**********************************************************
    public void spawnRoom(){
        //7 rooms
        int roomNum = rand.nextInt(7);
        if(roomNum == 0){
            room = new Garden();
        }else if(roomNum == 1){
            room = new Basement();
        }else if(roomNum == 2){
            room = new Cemetary();
        }else if(roomNum == 3){
            room = new Kitchen();
        }else if(roomNum == 4){
            room = new LivingRoom();
        }else if(roomNum == 5){
            room = new Morgue();
        }else if(roomNum == 6){
            room = new TortureChamber();
        }else{
            System.out.println("Error in spawn room");
        }
        
    }
    
    //**********************************************************
    //             Spawn an Enemy
    //**********************************************************
    public void spawnEnemy(Enemy enemy){
        this.enemies.add(enemy);
    }
    
    //**********************************************************
    //             Spawn an Random Enemy
    //**********************************************************
    public void spawnRandomEnemy(int num){
        for(int i=0;i<num;i++){
            //grab random number
            int monsterNum = rand.nextInt(4);
            //add enemy for random number
            if(monsterNum == 0){
                //slime    
                this.enemies.add(new Slime());
            }else if(monsterNum == 1){
                //skeleton
                this.enemies.add(new Skeleton());
            }else if(monsterNum == 2){
                //zombie
                this.enemies.add(new Zombie());
            }else if(monsterNum == 3){
                //bee
                this.enemies.add(new Beee());
            }else{
                //error catch
                System.out.println("Spawn Enemy: something went wrong");
            }
        }   
    }
    //**********************************************************
    //             Fight a single enemy
    //**********************************************************
    public void fightEnemy(Enemy e){
        
        //variable to end fight
        boolean done = false;
                
        //show player stats
        //showStats();   //removed to add difficulty
        
        //print enemy
        e.printYoSelf();
        
        //fight
        while(!done){
            //if player has health && enemy has health
            if(Player.getInstance().getCurrentHealth()>0 && e.getHealth()>0){
                //player hits first
                Player.getInstance().grabAttack();
                e.takeDamage(Player.getInstance().getAttackVal());
                //check to see if enemy hits back
                if(e.getHealth()<=0){
                    done = true;
                }else{
                    //enemy hits back
                    e.printYoAttack();
                    Player.getInstance().takeDamage(e.getAttackValue());
                }
            }
            
            //check if either is dead
            if(Player.getInstance().getCurrentHealth()<=0){
                //player is dead
                done=true;
            }else if(e.getHealth()<=0){
                //enemy is dead, remove them from list
                done=true;
                StringBuilder output = new StringBuilder();
                    output.append("You have defeated a ").append(e.getType()).append("!!!\n");
                JOptionPane.showMessageDialog(null,output);
                this.enemies.remove(0);
            }
        }

    }
    //**********************************************************
    //          Display Grave
    //**********************************************************
    public void displayWake(){
        StringBuilder output = new StringBuilder();
            output.append(  "                  _  /)\n").append(
                            "                 ,o / )\n").append(
                            "                 |/)\\)\n").append(
                            "                  /\\_\n").append(
                            "                  \\__|=\n").append(
                            "                 (    )\n").append(
                            "                 __)(__\n").append(
                            "           _____/      \\\\_____\n").append(
                            "          |  _     ___   _   ||\n").append(
                            "          | | \\     |   | \\  ||\n").append(
                            "          | |  |    |   |  | ||\n").append(
                            "          | |_/     |   |_/  ||\n").append(
                            "          | | \\     |   |    ||\n").append(
                            "          | |  \\    |   |    ||\n").append(
                            "          | |   \\. _|_. | .  ||\n").append(
                            "          |                  ||\n").append(
                            "          |  ").append(Player.getInstance().getName()).append("\n").append(
                            "          |                  ||\n").append(
                            "  *       | *   **    * **   |**      **\n").append(
                            "   \\)),,//.,/.,(//,,..,,\\||(,,.,\\\\,.((//");
            
            JTextArea tArea = new JTextArea(1, 1);
            tArea.setBackground(Color.LIGHT_GRAY);
            tArea.setForeground(Color.BLACK);
            tArea.setFont(new Font(Font.MONOSPACED, Font.BOLD, 20));
            tArea.setText(output.toString());
            JOptionPane.showMessageDialog(null, tArea, "Deep and Dreamless Slumber", JOptionPane.PLAIN_MESSAGE);
    }

    //**********************************************************
    //           Get current Health Modifier
    //**********************************************************
    public int getCurHealthModifier() {
        return curHealthModifier;
    }

    //**********************************************************
    //           Set current Health Modifier
    //**********************************************************
    public void setCurHealthModifier(int curHealthModifier) {
        this.curHealthModifier = curHealthModifier;
    }

    //**********************************************************
    //           Get current Damage modifier
    //**********************************************************
    public int getCurDamageModifier() {
        return curDamageModifier;
    }

    //**********************************************************
    //          Set current Health Modifier
    //**********************************************************
    public void setCurDamageModifier(int curDamageModifier) {
        this.curDamageModifier = curDamageModifier;
    }
}
