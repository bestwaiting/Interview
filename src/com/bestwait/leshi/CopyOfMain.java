package com.bestwait.leshi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class CopyOfMain
{
	public static void main(String[] args)
	{
		Scanner cin = new Scanner(System.in);  
		while (cin.hasNext())
		{
			long num1=cin.nextLong();
			long num2=cin.nextLong();
			GetEqualNum(num1,num2);
		}
	}
	public static void GetEqualNum(long num1,long num2)
	{
		if(num1==0)
		{
			if(num1==num2)
				System.out.println("YES");
			else 
				System.out.println("NO");
		}
		ArrayList<Integer> list=new ArrayList<>();
		while (num1>0)
		{
			list.add((int) (num1%10));
			num1/=10;
		}
		Collections.sort(list);
		if(list.contains(0))
		{
			int count=list.lastIndexOf(0);
			list.set(0, list.get(count+1));
			list.set(count+1, 0);
		}
		num1=0;
		for(int i=0;i<list.size();i++)
		{
			num1=num1*10+list.get(i);
		}
		if(num1==num2)
			System.out.println("YES");
		else 
			System.out.println("NO");
	}
}
