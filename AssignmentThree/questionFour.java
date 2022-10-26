
/*
	QUESTION FOUR:
	Write a ConsoleProgram that reads in a number from the user and then displays the
	Hailstone sequence for that number (Pick some positive integer and call it n. If n is even,
	divide it by two. If n is odd, multiply it by three and add one. Continue this process until n
	is equal to one).
*/

import java.util.*;

public class questionFour {
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		while(n != 1)
		{
			if(n % 2 == 0)
			{
				n /= 2;
				System.out.println(n);
			}
			else {
				n = (3*n + 1);
				System.out.println(n);
			}			
		}
	}
}
