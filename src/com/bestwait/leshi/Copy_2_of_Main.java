package com.bestwait.leshi;

import java.util.Scanner;

public class Copy_2_of_Main
{
	public static void main(String[] args)
	{
		Scanner cin = new Scanner(System.in);  
		while (cin.hasNext())
		{
			long num1=cin.nextLong();
			GetEqualNum(Math.abs(num1));
		}
	}
	public static void GetEqualNum(long num1)
	{
		int result=0;
		int count=1;
		while(num1!=0)
		{
			num1-=count;
			count++;
			result++;
		}
		System.out.println(result);
	}
}
