package basic_2811;

import java.util.Scanner;

public class largest_among3 {

	public static void main(String[] args) 
	{
		int num1,num2,num3;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter 3 numbers to find the largest:");
		num1=sc.nextInt();
		num2=sc.nextInt();
		num3=sc.nextInt();
		tochecknum1largest: 
			if(num1>num2 && num1>num3)
		{
		System.out.println(num1+ " is the largest");
	    }
		else if(num2>num1 && num2>num3)
		{
			System.out.println(num2+ " is the largest");
		}
		else
		{
			System.out.println(num3+ " is the largest");

		}
	}
}
