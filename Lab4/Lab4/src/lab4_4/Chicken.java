package lab4_4;

public class Chicken
{
	private double weight;
	private boolean sleeping;
	//Constructor. Assign values to variables.
	public Chicken(double WEIGHT)
	{
		weight = WEIGHT;
		sleeping = true;
	}
	//Return weight.
	public double getWeight()
	{
		return weight;
	}
	//Check sleep status.
	public boolean isSleeping()
	{
		return sleeping;
	}
	//Set chicken sleep.
	public void fallAsleep()
	{
		sleeping = true;
	}
	//Set chicken wake up.
	public void wakeUp()
	{
		sleeping = false;
	}
	public static void TestChicken()
	{
		Chicken c = new Chicken(2.3);		
	    System.out.println(c.getWeight() == 2.3);
	    System.out.println(c.isSleeping() == true);
	    c.wakeUp();
	    System.out.println(c.isSleeping() == false);
	    c.wakeUp(); // should do nothing because the chicken is already awake
	    System.out.println(c.isSleeping() == false);
	    c.fallAsleep();
	    System.out.println(c.isSleeping() == true);
	    c.fallAsleep(); // should do nothing because the chicken is already sleeping
	    System.out.println(c.isSleeping() == true);
	}
}
