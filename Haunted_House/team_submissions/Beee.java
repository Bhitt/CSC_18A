package haunted_house;

import java.awt.Font;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;


public class Beee extends Enemy{
	
@OVerride
public String getType(){
	return this.type;
}

@Override
public Integer getHealth(){
	return this.health = 5;
}
	
@Override
public Integer getAttackValue(){
	System.out.println("This Beee, throws its stingers at you!!!");
	return this.attackValue = 10;
}

	
}