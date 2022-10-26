import java.util.Arrays;

/*
	QUESTION THREE:
	Write a program to sort strings (using library function).

*/

public class questionThree {
	
	public static void main(String args[])
	{
		String s = new String("MichaelJordan");
		System.out.println(s);
		char []arr = s.toCharArray();
		Arrays.sort(arr);
		System.out.println(String.valueOf(arr));
	}
}
