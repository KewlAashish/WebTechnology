
public class Main
{
	public static void main(String[] args) {
        // question 1
        /*
        Write a Java program to print addition and subtraction of two
        integer numbers.
        */
        int a, b, c, d;
        a = 10;
        b = 15;
        System.out.println(a + b);

        c = 20;
        d = 10;
        System.out.println(c - d);
        
        // Question 2
        /*
        Write a Java program to print multiplication of two floating
        point numbers.
        */
        
        float e = 10, f = 2;
        System.out.println(e*f);
        
        /*
        Question 3
        Write a Java program to compute quotient and remainder and
        print it.
        */
        int quotient = 5 / 3;
        int remainder = 5 % 3;
        
        System.out.println(quotient);
        System.out.println(remainder);
        
        /*
        Question 4:
        Write a Java program to swap the values of integer number
        with using temporary variable and without using temporary
        variable
        */
        System.out.println("\n Initial value of a " + a);
        System.out.println("\n Initial value of b " + b);
        int temp = a;
        a = b;
        b = temp;
        System.out.println("\n Final value of a " + a);
        System.out.println("\n Final value of b " + b);
        
    }
}
