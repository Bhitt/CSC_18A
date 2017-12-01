/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package indiegame;

/**
 *
 * @author ncc
 */
public class QuitMenuItem implements IMenuItem {

    @Override
    public void execute() {
        System.exit(0);
    }

    @Override
    public String getText() {
        return "Turn tail and run away! Coward.";
    }
}
