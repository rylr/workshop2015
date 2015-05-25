import java.util.Random;


public class RandomInts
{
	public static void main(String[] args)
	{	
		int x = new Random().nextInt(41);
		
		x += 10;
		
		System.out.println(x);
	}
}
