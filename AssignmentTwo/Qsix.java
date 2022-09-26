import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	    /*
	    question 6:
	  
	    Write a do-while loop that will print out all the multiples of 3 from 3 to 36, that
        is: 3 6 9 12 15 18 21 24 27 30 33 36.
	    */
	    
	    int num = 0;
		do{
		    num = num + 3;
		    System.out.print(num + " ");
		}while(num < 36);
	}
}
