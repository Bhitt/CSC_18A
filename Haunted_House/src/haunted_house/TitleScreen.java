/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package haunted_house;

import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

/**
 *
 * @author ricsanram
 */
public class TitleScreen {
    //Prints title screen
    public void printTitleScreen(){
        StringBuilder output = new StringBuilder();
        output.append(" \n")
              .append("  888    888        d8888 888     888 888b    888 88888888888 888888888 8888888b.  \n")
              .append("  888    888       d88888 888     888 8888b   888     888     888       888  \"Y88b \n")
              .append("  888    888      d88P888 888     888 88888b  888     888     888       888    888 \n")
              .append("  8888888888     d88P 888 888     888 888Y88b 888     888     8888888   888    888 \n")
              .append("  888    888    d88P  888 888     888 888 Y88b888     888     888       888    888 \n")
              .append("  888    888   d88P   888 888     888 888  Y88888     888     888       888    888 \n")
              .append("  888    888  d8888888888 Y88b. .d88P 888   Y8888     888     888       888  .d88P \n")
              .append("  888    888 d88P     888  \"Y88888P\"  888    Y888     888     888888888 8888888P\"  \n")
              .append("\n")
              .append("               888    888  .d88888b.  888     888  .d8888b.  888888888             \n")
              .append("               888    888 d88P\" \"Y88b 888     888 d88P  Y88b 888       \n")
              .append("               888    888 888     888 888     888 Y88b.      888       \n")
              .append("               8888888888 888     888 888     888  \"Y888b.   8888888   \n")  
              .append("               888    888 888     888 888     888     \"Y88b. 888       \n")
              .append("               888    888 888     888 888     888       \"888 888       \n")  
              .append("               888    888 Y88b. .d88P Y88b. .d88P Y88b  d88P 888       \n")  
              .append("               888    888  \"Y88888P\"   \"Y88888P\"   \"Y8888P\"  888888888\n")
              .append("     *       .              (       .     .  .    *     .    .     *    .      .   \n")
              .append(".      .      *   .   *        )   .            .              .           *       \n")
              .append("            .               (         *               .              .            .\n")
              .append("     .             .    |^^^^^^^^^|     ./\\.                 *            .        \n")
              .append("     .       *          |.'`'.'`.'|  ./LLLLLL\\.   *     .         .        .  *  \n")
              .append("                  . .   |.'`'.'`.'|/LLLL/^^\\LLLL\\.         .  .                 .\n")  
              .append("          .             |.'`.`./LLLL/^        ^\\LLLL\\.                *          \n")
              .append("  .         .    *      |'./LLLL/^                ^\\LLLL\\.      .           *\n")
              .append("       *              ./LLLL/^       |__|  |__|       ^\\LLLL\\.         .     .\n")
              .append("              .   ./LLLL/^           |  |  |  |           ^\\LLLL\\.         \n")
              .append("       .      ./LLLL/^                                        ^\\LLLL\\.    .    * \n")
              .append("      .        ~~|.~                    ____                    ~.|~~            .\n")  
              .append("           .     ||                  .-'    '-.                  ||           \n")
              .append("  .     *        ||     _..._      .'  .-()-.  '.      _..._     ||    *   . .\n")
              .append("        .        ||   .'_____`.   /___:______:___\\   .'_____`.   ||  .             .\n")
              .append("              .  || .-|---.---|-.   ||  _  _  ||   .-|---.---|-. ||         \n")
              .append("wwwwwwwwwwwwwwwww|| |*|---|---|*|   || | || | ||   |*|---|---|*| ||wwwwwwwwwwwwwwwww\n")
              .append("                 || `-|___|___|-'   || |_||_| ||   `-|___|___|-' ||      .-\"\"\"-.\n")  
              .append("                 ||  '---------`    ||o _  _  ||    `---------'  ||     /       \\\n")
              .append("     .-\"\"-.      ||                 || | || | ||                 ||    |  R.I.P. |\n")
              .append("    / _  _ \\     ||                 || |_||_| ||                 ||    |         |\n")
              .append("    |(_\\/_)|     ||                _||________||_                ||    |   _|_   |\n")
              .append("    (_ /\\ _)     ||,,\\\\V//\\\\V//, _|___|------|___|_ ,\\\\V//\\\\V//,,||    |    |    |\n")  
              .append("     |wwww|      |--------------|____/--------\\____|--------------|    |         |  \n")
              .append("     '-..-'     /- _  -  _   - _ -  _ - - _ - _ _ - _  _-  - _ - _ \\  \\\\\\V//|\\\\V///\n")  
              .append("               /____________________________________________________\\\n");  
        
        JTextArea tArea = new JTextArea(1, 1);
        tArea.setFont(new Font(Font.MONOSPACED, Font.BOLD, 12));
        tArea.setText(output.toString());
        JFrame frame = new JFrame();
        frame.setAlwaysOnTop(true);
        JOptionPane.showMessageDialog(frame, tArea, " WELCOME TO HAUNTED HOUSE!", JOptionPane.PLAIN_MESSAGE);
        //get rid of frame or else program continues to run
        frame.dispose();
        
    }
    
}
