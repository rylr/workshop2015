import java.util.Random;

import javax.swing.JOptionPane;


public class FortuneCookieGame
{
	public static void main(String[] args)
	{
		String state1 = "You will be rich.";
		String state2 = "You will die.";
		String state3 = "You will win the HighLowGame.";
		String state4 = "You will win the SlotMachineGame.";
		
		int random = new Random().nextInt(5);
		
		if(random == 1)
		{
			JOptionPane.showMessageDialog(null, state1);
		}
		
		if(random == 2)
		{
			JOptionPane.showMessageDialog(null, state2);
		}
		
		if(random == 3)
		{
			JOptionPane.showMessageDialog(null, state3);
		}
		
		if(random == 4)
		{
			JOptionPane.showMessageDialog(null, state4);
		}
		
		
		
	}
}
