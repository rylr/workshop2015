import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class JLabelsAndFonts implements ActionListener
{
	JPanel panel;
	JFrame window;
	JLabel label;
	Font font;
	JButton up;
	JButton down;
	JButton color;
	JButton sizeUp;
	JButton sizeDown;
	JButton emote;
	
	String[] texts = new String[11];
	
	int fontSize = 100;
	int number = 1;
	Random ran;
	
	
	public static void main(String[] args)
	{
		JLabelsAndFonts n = new JLabelsAndFonts();	
	}
	
	public JLabelsAndFonts()
	{
		texts[0] = "Kappa";
		texts[1] = "Kreygasm";
		texts[2] = "BionicBunion";
		texts[3] = "KappaPride";
		texts[4] = "Keepo";
		texts[5] = "PogChamp";
		texts[6] = "BibleThump";
		texts[7] = "SourPls";
		texts[8] = "FailFish";
		texts[9] = "DogFace";
		texts[10] = "DansGame";
		
		panel = new JPanel();
		
		window = new JFrame();
		window.setVisible(true);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.add(panel);
		
		label = new JLabel();
		panel.add(label);
		font = new Font("ComicSansMS", Font.BOLD, fontSize);
		label.setFont(font);
		label.setText(number + "");
		
		up = new JButton("Up");
		panel.add(up);
		up.addActionListener(this);
		
		down = new JButton("Down");
		panel.add(down);
		down.addActionListener(this);
		
		color = new JButton("Color");
		panel.add(color);
		color.addActionListener(this);
		
		sizeUp = new JButton("Size Up");
		panel.add(sizeUp);
		sizeUp.addActionListener(this);
		
		sizeDown = new JButton("Size Down");
		panel.add(sizeDown);
		sizeDown.addActionListener(this);
		
		emote = new JButton("New Emote");
		panel.add(emote);
		emote.addActionListener(this);
		
		ran = new Random();
		
		window.setSize(1200, 200);
	}
	
	@Override
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==up)
		{
			number += 1;
			label.setText(number + "");
		}
		else if(e.getSource()==down)
		{
			number -= 1;
			label.setText(number + "");
		}
		else if(e.getSource()==color)
		{
			label.setForeground(new Color(ran.nextInt(256), ran.nextInt(256), ran.nextInt(256)));
		}
		else if(e.getSource()==sizeUp)
		{
			fontSize += 4;
			font = new Font("ComicSansMS", Font.BOLD, fontSize);
			label.setFont(font);
		}
		else if(e.getSource()==sizeDown)
		{
			fontSize -= 4;
			font = new Font("ComicSansMS", Font.BOLD, fontSize);
			label.setFont(font);
		}
		else if(e.getSource()==emote)
		{
			label.setText(texts[ran.nextInt(11)]);
		}
	}
}
