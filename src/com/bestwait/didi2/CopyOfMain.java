package com.bestwait.didi2;

import java.util.Scanner;

public class CopyOfMain
{
	public static void main(String[] args)
	{
		Scanner cin = new Scanner(System.in);  
		int num=cin.nextInt();
		System.out.println(countZeroNum(num));
	}
	public static int countZeroNum(int num)
	{
		int result = 0;
		for (int i = 1; i <= num; i++)
		{
			int j = i;
			while(j%5==0) 
			{
				result++;
				j/=5;
			}
		}
			return result;
	}
}
