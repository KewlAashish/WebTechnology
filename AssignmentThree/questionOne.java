/*
	QUESTION ONE:
	Write a java program to compare two strings lexicographically (without using library
	function).
*/

public class questionOne {
	
	public static int compareFunc(String s1, String s2)
	{
		for(int i = 0; i < s1.length() && i < s2.length(); i++)
		{
			if((int)s1.charAt(i) == (int)s2.charAt(i))
			{
				continue;
			}
			else {
				return (int)s1.charAt(i) - (int)s2.charAt(i);
			}
		}
		
		if(s1.length() != s2.length())
		{
			return s1.length() - s2.length();
		}
		
		return 0;
	}

	public static void main(String args[])
	{
		String s1 = new String("Aashish");
		String s2 = new String("Rohan");
		String s3 = new String("Aashish");
		String s4 = new String("Rohan Aashish");
		
		System.out.println(compareFunc(s1,s2));
		System.out.println(compareFunc(s1,s3));
		System.out.println(compareFunc(s1,s4));
	}
}
