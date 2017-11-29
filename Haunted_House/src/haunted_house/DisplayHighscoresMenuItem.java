/* DisplayHighscoresMenuItem class that - derives from menu item
 *                                      - loads in a CSV file
 *                                      - ouputs the CVS file contents to the user
 * 
 */

package haunted_house;

/**
 *
 * @author ncc
 */
public class DisplayHighscoresMenuItem extends MenuItem {
    
    
    //**********************************************************
    //                 Perform Menu Item Action
    //**********************************************************
    @Override
    public boolean doThing(){
        //Create HighScoreIO object
        HighScoreIO placard = new HighScoreIO();
        placard.displayHighScores();
        return false;
    }
    
    //**********************************************************
    //                 Print string for menu prompt
    //**********************************************************
    @Override
    public String printYoSelf(){
        return "View High Scores";
    }
}
