//Java Program to Print an Integer (Entered by the User)
	
package basic_2811;
import java.util.Scanner;

public class Print_integer {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number to display:");	
		int n=sc.nextInt();
		System.out.println("User entered:" +n);

	}

}
