/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package haunted_house;

import java.io.File;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author ncc
 */
public class HighScoreIO {
    
    public HighScoreIO(){
        
    }
    
    
    private void readHighScoreFile(){
        //dummy data set
        Map<String, Integer> unsortedData = new HashMap<String, Integer>();
        unsortedData.put("Branden", 56874);
        unsortedData.put("Kevin", 56873);
        unsortedData.put("Brett", 66743);
        unsortedData.put("Kyle", 60431);
//       File importFile = new File(input);
//       Scanner fileIn(importFile);
       
        
        
        
        Map<String, Integer> sorted = sortMap(unsortedData);
        printMap(sorted);
        
    }
    
    private void outputHighScoreFile(){
        
    }
    
    public static Map<String, Integer> sortMap(Map<String, Integer> unsortedMap){
        //Convert Map to List of Map
        List<Map.Entry<String,Integer>> list = 
                new LinkedList<Map.Entry<String, Integer>>(unsortedMap.entrySet());
        
        //Sort list with collections.sort
        //  can switch o1 and o2 positions for a different order
        Collections.sort(list, new Comparator<Map.Entry<String, Integer>>(){
            public int compare(Map.Entry<String, Integer> o1,
                               Map.Entry<String, Integer> o2){
                return (o2.getValue()).compareTo(o1.getValue());
            }
        });
        
        //Loop the sorted list and put it into a new insertion order Map LinkedHashMap
        Map<String, Integer> sortedMap = new LinkedHashMap<String, Integer>();
        for(Map.Entry<String, Integer> entry :list){
            sortedMap.put(entry.getKey(), entry.getValue());
        }
        
        return sortedMap;
        
    }
    
    public static <K, V> void printMap(Map<K, V> map) {
        for (Map.Entry<K, V> entry : map.entrySet()) {
            System.out.println("Key : " + entry.getKey()
				+ " Value : " + entry.getValue());
        }
    }
}
