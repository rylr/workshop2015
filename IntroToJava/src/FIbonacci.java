
public class FIbonacci
{
	public static void main(String[] args)
	{
		int z = 0;
		int p = 1;
		int f = 0;
		
		for (int i = 0; i < 10; i++)
		{
			f = z + p;
			
			z = p;
			
			p = f;
			
			System.out.println(f);
			
			
			
			 
		}
	}
}
