import javax.swing.JOptionPane;

/*
 * I have a pocket full of change. I hate doing math. Make me a program that
 * will calculate how much money I have without me having to use my brain. Then
 * make me a sandwich.
 */
public class changeCalculator {

	public static void main(String[] args) {

		// Ask the user how many nickels they have
String strnick = JOptionPane.showInputDialog("How many nickels do you have?");
		// Convert their answer to an int using Integer.parseInt()
double nick = Double.parseDouble(strnick);
		// Ask the user how many dimes they have, and convert their answer
String strdime = JOptionPane.showInputDialog("How many dimes do you have?");
double dime = Double.parseDouble(strdime);
		// Ask the user how many quarters they have, and convert their answer
String strquart = JOptionPane.showInputDialog("How many quarters do you have?");
double quart = Double.parseDouble(strquart);
		// Calculate how much money the user has and save it in a double variable 

		// Tell the user how much money they have
double cash = ((nick/100)*5) + ((dime/100)*10) + ((quart/100)*25);
JOptionPane.showMessageDialog(null, "You have $" + cash);
	}
}