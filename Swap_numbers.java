//swap numbers
package basic_2811;

import java.util.Scanner;

public class Swap_numbers {

	public static void main(String[] args) 
	{
		int num1;
		int num2;
		int temp;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter two numbers before swap:");
		num1=sc.nextInt();
		num2=sc.nextInt();
		temp=num1;
		num1=num2;
		num2=temp;
		System.out.println("Numbers after swap:" +num1  +num2);

	}

}
