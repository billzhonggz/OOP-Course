package assignment1;

public class Question5
{
	public static boolean isAnagram(String str1, String str2)
	{
		// Check length first. If they are not equal, directly return.
		if (str1.length() != str2.length())
		{
			return false;
		}
		// Convert string str1 to an array.
		char[] chars = str1.toCharArray();
		// Read and compare characters one by one.
		for (char c : chars)
		{
			int index = str2.indexOf(c);
			//Judge if the character not exist.
			//If exists, go next. If not, return false. 
			if (index != -1)
			{
				str2 = str2.substring(0, index) + str2.substring(index + 1, str2.length());
			} 
			else
			{
				return false;
			}
		}
		return str2.isEmpty();
	}

	public static void testIsAnagram() 
	{
		//Test cases: anagrams.
		System.out.println(isAnagram("word", "wrdo")); 
		System.out.println(isAnagram("mary", "army")); 
		System.out.println(isAnagram("stop", "tops")); 
		//Test cases: same length, not anagrams.
		System.out.println(isAnagram("boat", "btoa")); 
		System.out.println(isAnagram("pure", "in")); 
		System.out.println(isAnagram("fill", "fil")); 
		//Test cases: different lengths.
		System.out.println(isAnagram("b", "bbb")); 
		System.out.println(isAnagram("ccc", "ccccccc")); 
	}
	
	public static void main(String[] args)
	{
		testIsAnagram();
	}
}
