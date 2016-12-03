package com.bestwait.toutiao;

import java.util.Scanner;

public class CopyOfMain
{
	static int[] Next=new int[1000100];
	public static void main(String[] args)
	{
		Scanner cin = new Scanner(System.in);  
		String string = cin.nextLine();
		int len = string.length();
		getNext(string,len);
		if(Next[len] <= 0)
		{
			System.out.println(1);
		}
		int t = len - Next[len];
		if(len % t == 0) 
			System.out.println(len/t);
		else 
			System.out.println(1);
	}
	public static void getNext(String str,int len)
	{
		int i = 0;
		int j = -1;
		Next[0] = -1;
		while(i < len)
		{
			if(j == -1 || str.charAt(i) == str.charAt(j))
				Next[++i] = ++j;
			else j = Next[j];
		}	

	}
}