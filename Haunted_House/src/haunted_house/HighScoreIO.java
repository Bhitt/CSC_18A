/*HighScoreIO class that    - handles file input and output
 *                          - sorts the data (Highscores) before outputting
 *                          - utilizes Maps and LinkedLists to handle data
 *
 */

package haunted_house;

//library imports
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ncc
 */
public class HighScoreIO {
    private static final String FILENAME = "HighScores.csv";
    
    //**********************************************************
    //                 Default Constructor 
    //**********************************************************
    public HighScoreIO(){
        
    }
    
    //**********************************************************
    //                 Update High Score List with new Value 
    //**********************************************************
    public void addHighScore(){
        //read in the current file if it exists (create it, if it doesn't)
        //          -> then parse data into a map
        Map<String, Integer> unsorted = readHighScoreFile();
        
        //append new death stats to end of Map (name, floors cleared)
        unsorted.put(Player.getInstance().getName(), Player.getInstance().getRoomsCleared());
        
        //sort the data from the file
        Map<String, Integer> sorted = sortMap(unsorted);
        
        //overwrite the existing file with the sorted updates
        writeHighScoreFile(sorted);
    }
    
    //**********************************************************
    //                 Display High Scores in a Table
    //**********************************************************
    public void displayHighScores(){
        //temp variables
        String dataKey;
        String dataValue;
        String skip;

        //create object of table and table model
        JTable table = new JTable();
        DefaultTableModel dtm = new DefaultTableModel(0,0);
        
        //add header for the table
        String header[] = new String[] {"DECEASED", "ROOMS CLEARED"};
        
        //add header into table model
        dtm.setColumnIdentifiers(header);
        
        //set model into the table object
        table.setModel(dtm);
        
        //read in the file
        try{
            File importHS = new File(FILENAME);
            
            //check to see the file exists
            if(!importHS.exists()){
                importHS.createNewFile();
            }
            
            Scanner fileIn = new Scanner(importHS);
            //skip file headers
            if(fileIn.hasNextLine()){
                skip = fileIn.nextLine();
            }
            //read in each line
            while(fileIn.hasNextLine()){
                String line = fileIn.nextLine();
                //parse the line into two strings
                String[] data = line.split(",");
                
                dataKey = data[0];
                dataValue = data[1];
                //add the name and value pair to the table as a row
                dtm.addRow(new Object[] {dataKey,dataValue});
            }
            //output the string
            final JDialog dialog = new JDialog();
            dialog.setAlwaysOnTop(true);     
            JOptionPane.showMessageDialog(dialog, new JScrollPane(table));
            dialog.dispose();
        }catch(FileNotFoundException e){
            //file not found output
            e.printStackTrace(System.out);
            final JDialog dialog = new JDialog();
            dialog.setAlwaysOnTop(true);
            JOptionPane.showMessageDialog(dialog, "File (HighScores.csv) not found.");
            dialog.dispose();
        }catch(IOException ex){
            ex.printStackTrace(System.out);
        }   
    }
    
    //**********************************************************
    //                 Read in a File with High Scores 
    //**********************************************************
    public static Map<String, Integer> readHighScoreFile(){
        String skip = "";
        String dataKey;
        String dataValue;
        Map<String, Integer> unsortedData = new HashMap<>();
        //Dummy values
//        unsortedData.put("Branden", 54);
//        unsortedData.put("Kevin", 23);
//        unsortedData.put("Brett", 42);
//        unsortedData.put("Kyle", 53);
        try{
            File importHS = new File(FILENAME);
            
            //check for existing file
            if(!importHS.exists()){
                importHS.createNewFile();
            }
            
            Scanner fileIn = new Scanner(importHS);
            //skip first line of headers
            if(fileIn.hasNextLine()){
                skip = fileIn.nextLine();
            }
            //read in each line
            while(fileIn.hasNextLine()){
                String line = fileIn.nextLine();
                String[] data = line.split(",");
                dataKey = data[0];
                dataValue = data[1];
                //add the Name/Value to the Map
                unsortedData.put(dataKey, Integer.parseInt(dataValue));
            }
        }catch(FileNotFoundException e){
            JOptionPane.showMessageDialog(null, "File not found.");
            unsortedData.put("Dr Acula", 433);
        }catch(IOException ex){
            ex.printStackTrace(System.out);
        } 
        return unsortedData;
    }
    
    //**********************************************************
    //                 Write High Scores to a File 
    //**********************************************************
    public void writeHighScoreFile(Map<String, Integer> sorted){
        String pairString;
        try{
            //open file to write to
            File exportHS = new File(FILENAME);
            //write Header
            try (FileWriter fileOut = new FileWriter(exportHS,false) //false to overwrite existing file
            ) {
                //write Header
                fileOut.write("DECEASED,ROOMS CLEARED\n");
                //write each pair as a single string
                for(Map.Entry<String, Integer> entry : sorted.entrySet()) {
                    pairString = entry.getKey() + "," + entry.getValue() + "\n";
                    //send the string to file
                    //System.out.println(pairString);
                    fileOut.write(pairString);
                }
            }
        }catch(IOException e){
            e.printStackTrace(System.out);
        }
    }
    
    //**********************************************************
    //                 SORT A MAP 
    //**********************************************************
    public static Map<String, Integer> sortMap(Map<String, Integer> unsortedMap){
        //Convert Map to List of Map
        List<Map.Entry<String,Integer>> list = 
                new LinkedList<>(unsortedMap.entrySet());
        
        //Sort list with collections.sort
        //  can switch o1 and o2 positions for a different order
        Collections.sort(list, (Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) -> (o2.getValue()).compareTo(o1.getValue()));
        
        //Loop the sorted list and put it into a new insertion order Map LinkedHashMap
        Map<String, Integer> sortedMap = new LinkedHashMap<>();
        list.forEach((entry) -> {
            sortedMap.put(entry.getKey(), entry.getValue());
        });
        
        return sortedMap;
        
    }
    
    //**********************************************************
    //                 PRINT A MAP (For Testing Purposes)
    //**********************************************************
//    public static <K, V> void printMap(Map<K, V> map) {
//        map.entrySet().forEach((entry) -> {
//            System.out.println("Key : " + entry.getKey()
//                    + " Value : " + entry.getValue());
//        });
//    }
    
}
