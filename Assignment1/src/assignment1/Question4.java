package assignment1;

public class Question4
{
	private String str;
	public Question4(String s)
	{
		str = s;
	}
	public void reverse()
	{
		//Copy the original string to an array.
		char[] tempArray = str.toCharArray();
		//Get length of original string.
		int left = 0;
		int right = tempArray.length - 1;
		//Read original char array inversely and copy them to the new array.
		for (left = 0; left < right; left++, right--)
		{
			char temp = tempArray[left];
			tempArray[left] = tempArray[right];
			tempArray[right] = temp;
		}
		//Print out this array.
		System.out.println("Input string is: " + str);
		System.out.print("Reversed string is: ");
		for (char c : tempArray)
		{
			System.out.print(c);
		}
		System.out.println();
	}
	public static void main(String[] args)
	{
		Question4 r = new Question4("test");
		r.reverse();
	}
}
