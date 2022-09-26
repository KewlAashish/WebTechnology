import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	    /*
	    question 4:
	  
	    A city of 80,000 peoples is increasing at the rate of 5% annually. When will
        their population first exceed 150000? Write a java program for it. Use While Loop.
	    */
	    
	    double interest = 0.05;
		int population = 80000;
		int year = 0;
		
		while(population<=150000)
		{
		    population = (int) (population*(1+interest));
		    year += 1;
		}
		System.out.println(year);
	    
	}
}
