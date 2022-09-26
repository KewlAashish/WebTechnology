public class MinOfThree
{
	public static void main(String[] args) {
	    /*
	    question 2:
	  
	    Write the main() method of the MinOfThree class that determines which of the
        three numbers is the smallest number, and displays that number using if-else
        statement.(Note: You don’t have to take input from user. )
	    */
	    int a = 12;
        int b = 25;
        int c = 10;

        if (a <= b && a <= c)
        {
	        System.out.println (a);
        }
        else if (b <= a && b <= c)
        {
	        System.out.println (b);
        }
        else
        {
	        System.out.println (c);
        }
	}
}
