package com.bestwait.xiaomi;

import java.util.Scanner;


public class Copy_4_of_Main
{
	
	 public static void main(String[] args)
	 {
		Scanner cin = new Scanner(System.in);  
		
		while (cin.hasNext())
		{
			String str=cin.nextLine();
			String[] nums=str.split(" ");
			StringBuffer buffer=new StringBuffer();
			for(int i=nums.length-1;i>=0;i--)
			{
				buffer.append(nums[i]+" ");
			}
			System.out.println(buffer.substring(0, buffer.length()-1).toString());
		} 
		
	 }
}