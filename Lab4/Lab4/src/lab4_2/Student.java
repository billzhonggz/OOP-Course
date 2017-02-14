package lab4_2;

public class Student
{
	private int id;
	private boolean sleeping;
	public Student(int ID)
	{
		id = ID;
		sleeping = false;
	}
	public int getID()
	{
		return id;
	}
	public boolean isSleeping()
	{
		return sleeping;
	}
	public void fallAsleep()
	{
		sleeping = true;
	}
	public void wakeUp()
	{
		sleeping = false;
	}
	public static void TestStudent()
	{
		Student s = new Student(9999999);
	    System.out.println(s.getID() == 9999999);
	    System.out.println(s.isSleeping() == false);
	    s.fallAsleep();
	    System.out.println(s.isSleeping() == true);
	    s.fallAsleep(); // should do nothing because the student is already sleeping
	    System.out.println(s.isSleeping() == true);
	    s.wakeUp();
	    System.out.println(s.isSleeping() == false);
	    s.wakeUp(); // should do nothing because the student is already awake
	    System.out.println(s.isSleeping() == false);
	}
}

