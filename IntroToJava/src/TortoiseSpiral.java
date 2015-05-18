import javax.swing.JOptionPane;
import javax.swing.JPopupMenu;

import org.teachingextensions.logo.Tortoise;

public class TortoiseSpiral {

	public static void main(String[] args) {
		
		
		boolean run = true;
			
			int sides = 0;
			Tortoise.setSpeed(10);
		
			String input = JOptionPane.showInputDialog("Which spiral would you like? Type it below.");
			
		
			if (input.equalsIgnoreCase("Square")){
				sides = 90;
			
					
			}
			
			else if (input.equalsIgnoreCase("Triangle")){
				sides = 120;
				
					
			}
			
			else if (input.equalsIgnoreCase("Hexagon")){
				sides = 60;
				
					
			}
			
		
		
		
		// 6. If the user enters something else, say "Sorry, I don't know how to draw a ..."
			else {
				JOptionPane.showMessageDialog(null, "Sorry, I don't know how to draw that.");
				run = false;
			}
	
			if(run){
				for (int i = 0; i < 99; i+= 7)
				{
					Tortoise.move(100 + i);
					Tortoise.turn(sides);
				}
			}
			
		
		
		
		
		
	}

}
