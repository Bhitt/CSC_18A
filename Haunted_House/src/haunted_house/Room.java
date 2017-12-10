/* Room abstract class that - allows other Rooms to derive from
 *                          - gives specifications for anything that derives from Room
 * 
 * 
 */

package haunted_house;

//library imports
import java.util.ArrayList;

/**
 *
 * @author ncc
 */
public abstract class Room {
    //Room properties
    String type;
    //**********************************************************
    //      Required method -  displays text for win 
    //**********************************************************
    public abstract void printGreeting();
    //**********************************************************
    //      Required method -  displays text for win 
    //**********************************************************
    public abstract void printVictory();
    //**********************************************************
    //      Required method -  displays picture of room 
    //**********************************************************
    public abstract void printYoRoom();
}
