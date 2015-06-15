import java.util.Random;

import javax.swing.JOptionPane;


public class NumberQuestions
{
	public static void main(String[] args)
	{
		int min = Integer.parseInt(JOptionPane.showInputDialog("What is your minimum number?"));
		int max = Integer.parseInt(JOptionPane.showInputDialog("What is your maximum number?"));
		
		if(min > max)
			JOptionPane.showMessageDialog(null, "Error, make new numbers.");
		
		int random = Integer.parseInt(JOptionPane.showInputDialog("Give me another random number."));
		
		for (int i = 0; i <= random; i++)
		{
			int x = new Random().nextInt(max-min)+min;
			System.out.println(x);
			
		}
		
	}
}
