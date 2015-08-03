import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class GuiIntro implements ActionListener
{
	JFrame window;
	JPanel panel;
	JButton button;
	JTextField text;
	
	public static void main(String[] args)
	{
		GuiIntro g = new GuiIntro();

	}
	
	public GuiIntro()
	{
		window = new JFrame();
		window.setVisible(true);
		window.setSize(500, 500);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		panel = new JPanel();
		
		button = new JButton("Dedotated");
		
		text = new JTextField(10);
		
		panel.add(button);
		window.add(panel);
		button.addActionListener(this);
		
		
		panel.add(text);
		
		window.pack();
	}

	@Override
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==button)
		{
			System.out.println("Clicked");
			text.setText("Wam");
		}
	}
	
}
