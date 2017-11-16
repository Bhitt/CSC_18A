/* Room abstract class that - allows other Rooms to derive from
 *                          - gives specifications for anything that derives from Room
 * 
 * 
 */

package haunted_house;

/**
 *
 * @author ncc
 */
public abstract class Room {
    String type;
    Integer numEnemies;
    Integer aliveEnemies;
    Integer numHiddenItems;
}
