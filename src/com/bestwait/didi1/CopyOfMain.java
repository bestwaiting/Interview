package com.bestwait.didi1;

import java.util.Scanner;

public class CopyOfMain
{
	public static void main(String[] args)
	{
		Scanner cin = new Scanner(System.in);  
	    int num=cin.nextInt();  
	    while(num>0)
	    {
	    	System.out.print(num%10);
	    	num/=10;
	    }
	}
	
}
