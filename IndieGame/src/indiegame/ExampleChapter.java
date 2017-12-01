/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package indiegame;

import java.util.ArrayList;

/**
 *
 * @author ncc
 */
public class ExampleChapter extends Chapter {
    
    public ExampleChapter() {

        this.menuItem = new IMenuItem() {

            @Override
            public String getText() {
                return "Test Chapter. Please Ignore";
            }

            @Override
            public void execute() {
                // Do whatever you want here!
                System.out.println("All I do is print, print, print no matter what...");
            }
        };
        
    }
    
}
