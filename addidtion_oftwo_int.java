//Example 2: Program to Add Two Integers
package basic_2811;

import java.util.Scanner;

public class addidtion_oftwo_int {

	public static void main(String[] args) 
	{
		int result;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two numbers:");
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		result=num1+num2;
		System.out.println("Addition of two integers:"+result);

	}

}
