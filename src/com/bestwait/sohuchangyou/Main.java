package com.bestwait.sohuchangyou;

import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		Scanner cin = new Scanner(System.in);  
		while (cin.hasNext())
		{
			String string = cin.nextLine();
			string=string.substring(2);
			System.out.println(Integer.parseInt(string,16));
		}
	}
	
}
