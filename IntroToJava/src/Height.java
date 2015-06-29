import javax.swing.JOptionPane;


public class Height
{
	public static void main(String[] args)
	{
		int x = JOptionPane.showInputDialog("How tall are you?");
		
		if(x>50){
			JOptionPane.showMessageDialog(null, "You may enter the ride");
		}
		
		if(x<=50){
			JOptionPane.showMessageDialog(null, "Go away");
		}
	}
}
