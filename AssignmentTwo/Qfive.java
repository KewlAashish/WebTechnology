import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	    /*
	    question 5:
	  
	    You are to write a program that generates the second, third, and fourth powers
        of a list of whole numbers from 1 to n where n can be any number(Let say n=5).
        Write a Java program to do this. Show output column headers (see below, n, n^2,
        n^3, n^4). Then, use a for loop to iterate from 1 to n, computing each of that loop
        variable to the second power, third power and fourth power. Assuming your loop
        variable is called i, you can do this either as i*i or Math.pow(i,2).
	    */
	    
	    Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println("n n^2 n^3 n^4");
        for(int i=1;i<=n;i++)
        {
            System.out.println(i+" "+i*i+" "+i*i*i+" "+i*i*i*i);
        }
	}
}
