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
public interface IMenu {
    public void printMenu();
    public Integer getInput();
    public void performAction(Integer selection);
}
