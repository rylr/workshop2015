import java.util.Random;

import javax.swing.JOptionPane;


public class HiLowGame
{
	public static void main(String[] args)
	{
		int x = new Random().nextInt(101);
		
		while(true){
			
		String p = JOptionPane.showInputDialog("What number is x?");
		
		int z = Integer.parseInt(p);
		
		if(z < x)
		{
			System.out.println("Higher");
		}
		else if(z > x)
		{
			System.out.println("Lower");
		}
		else if(z == x)
		{
			System.out.println("You win!");
		}
		}
	}
}
