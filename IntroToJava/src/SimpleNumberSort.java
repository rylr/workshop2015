import javax.swing.JOptionPane;

public class SimpleNumberSort
{
	public static void main(String[] args)
	{
		String x = JOptionPane.showInputDialog("Type a random number here.");
		String y = JOptionPane.showInputDialog("Type another random number here.");
		String z = JOptionPane.showInputDialog("Type another random number here.");
		int a = Integer.parseInt(x);
		int b = Integer.parseInt(y);
		int c = Integer.parseInt(z);
		
		//Ascending Order		
		
		System.out.println("Step One: Ascending Order");
		
		if(a > b && b > c)
		{
			System.out.println(c);
			System.out.println(b);
			System.out.println(a);
		}
		else if(b > a && c > b)
		{
			System.out.println(a);
			System.out.println(b);
			System.out.println(c);
		}
		else if(a > b && c > b && c > a)
		{
			System.out.println(b);
			System.out.println(a);
			System.out.println(c);
		}
		else if(a > b && c > b && a > c)
		{
			System.out.println(b);
			System.out.println(c);
			System.out.println(a);
		}
		else if(b > a && b > c && a > c)
		{
			System.out.println(c);
			System.out.println(a);
			System.out.println(b);
		}
		else if(b > a && b > c && c > a)
		{
			System.out.println(a);
			System.out.println(c);
			System.out.println(b);
		}
		
		//Descending Order
		
		System.out.println("Step Two: Descending Order");
		
		if(a > b && b > c)
		{
			System.out.println(a);
			System.out.println(b);
			System.out.println(c);
		}
		else if(b > a && c > b)
		{
			System.out.println(c);
			System.out.println(b);
			System.out.println(a);
		}
		else if(a > b && c > b && c > a)
		{
			System.out.println(c);
			System.out.println(a);
			System.out.println(b);
		}
		else if(a > b && c > b && a > c)
		{
			System.out.println(a);
			System.out.println(c);
			System.out.println(b);
		}
		else if(b > a && b > c && a > c)
		{
			System.out.println(b);
			System.out.println(a);
			System.out.println(c);
		}
		else if(b > a && b > c && c > a)
		{
			System.out.println(b);
			System.out.println(c);
			System.out.println(a);
		}
	}	
		static void order(int one, int two)
		{
			
		}
		
	
}
