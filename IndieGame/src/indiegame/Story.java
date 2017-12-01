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
public class Story {
    private ArrayList<Chapter> chapters;
    
    public Story() {
        chapters = new ArrayList();
    }
    
    public void addChapter(Chapter newChapter) {
        this.chapters.add(newChapter);
    }
    
    public ArrayList<Chapter> getChapters() {
        return this.chapters;
    }
}
