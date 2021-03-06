import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class CheapCalc implements ActionListener
{
	JFrame window;
	JPanel panel;
	JTextField one;
	JTextField two;
	JButton buttonAdd;
	JButton buttonSub;
	
	public static void main(String[] args)
	{
		CheapCalc a = new CheapCalc();
	}
	
	public CheapCalc()
	{
		window = new JFrame("Cheap Calculator");
		window.setVisible(true);
		window.setSize(400, 100);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		panel = new JPanel();
		buttonAdd = new JButton("Add");
		one = new JTextField(10);
		two = new JTextField(10);
		
		panel.add(one);
		panel.add(two);
		panel.add(buttonAdd);
		window.add(panel);
		
		buttonAdd.addActionListener(this);
		
		window.pack();
	}

	@Override
	public void actionPerformed(ActionEvent e)
	{
		int numOne = Integer.parseInt(one.getText());
		int numTwo = Integer.parseInt(two.getText());
		
		if(e.getSource()==buttonAdd)
		{
			System.out.println(numOne + numTwo);
		}
		
	}
}
