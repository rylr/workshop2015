import java.util.Random;


public class SlotMachine
{
	public static void main(String[] args)
	{
		new SlotMachine();
	}
	
	public SlotMachine(){
		int num1 = new Random().nextInt(100);
			System.out.println(num1);
		int num2 = new Random().nextInt(100);
			System.out.println(num2);
		int num3 = new Random().nextInt(100);
			System.out.println(num3);
	}
}
