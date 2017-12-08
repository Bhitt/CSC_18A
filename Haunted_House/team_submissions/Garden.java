import java.util.Scanner;
/* Garden class that - derives from the Room class
 *                   - holds unique item spawn
 *                   - displays unique setting
 * 
 */

package haunted_house;

/**
 *
 * @author ncc
 */
public class Garden extends Room{
    
    int numEnemies;
    int [] enemies = new int[numEnemies];
    
    int numHiddenItems = 3;
    
    int aliveEnemies = numEnemies;
    
Scanner keyboard = new Scanner(System.in);
    
System.out.println("Hello and Goodbye you foool, you have steped into the garden, now me and my beees shall be able to cut you into pieces, I only have one question how many years have you poisone the world with that ugly face?");
numEnemies = keyboard.nextInt();

enemies = new int[numEnemies];

for (int index = 0; index < numEnemies.length; index++) 
{
	enemeies[index] = this.beee
}

for (aliveEnemies = 0);
{
	System.out.println("Jynkysss, you have defeated my swarm of Beee, how could you!!!!!!");
	System.out.println("Congrats you have found 3 hidden Items");
}
    
}