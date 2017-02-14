package lab4_4;

public class Start
{
	public static void main (String[] args)
	{
		Chicken.TestChicken();
		System.out.println(Check());
	}
	public static String Check()
	{
		Chicken s = new Chicken(2.3);
		if (s.isSleeping() == true)
			return "sweet dreams";
		else
			return "need coffee";
	}
}
