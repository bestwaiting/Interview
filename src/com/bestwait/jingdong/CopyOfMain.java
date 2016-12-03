package com.bestwait.jingdong;

import java.util.Scanner;
import java.io.*;
import java.util.*;

public class CopyOfMain
{
  public static void main(String args[])
  {
	  Scanner cin = new Scanner(System.in);  
		while (cin.hasNext())
		{
			String string = cin.nextLine();
			int num=Integer.parseInt(string);
			getValue(num);
		}
  }
  public static void getValue(int num)
	{
		int result=0;
		for(int i=2;i<num;i++)
		{
			result+=singleNum(num,i);
		}
		int gcd=gcd(result,num-2);
		System.out.println(result/gcd+"/"+(num-2)/gcd);
	}
  public static int gcd(int x, int y)
  { 
	    if(y == 0)
	        return x;
	     else
	        return gcd(y,x%y);
  }
	public static int singleNum(int num,int base)
	{
		int result=0;
		while(num!=0)
		{
			result+=num%base;
			num/=base;
		}
		return result;
	}
}