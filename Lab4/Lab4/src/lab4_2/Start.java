package lab4_2;

public class Start
{
	public static void main (String[] args)
	{
		Student.TestStudent();
		System.out.println(Check());
	}
	public static String Check()
	{
		Student s = new Student(9999999);
		if (s.isSleeping() == true)
			return "sweet dreams";
		else
			return "need coffee";
	}
}
