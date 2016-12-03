package com.bestwait.huawei;

import java.util.Scanner;

public class CopyOfCopyOfMain
{
	public static void main(String args[]){
		Scanner cin = new Scanner(System.in);
		String temp=cin.nextLine();
		int num=Integer.parseInt(temp);
		for(int i=0;i<num;i++)
		{
			String a=cin.nextLine();
			String b=cin.nextLine();
			int result=Integer.MAX_VALUE;
			for(int j=0;j<a.length();j++)
			{
				if(a.charAt(j)==b.charAt(0))
				{
					int temp1=findMin(a.substring(j, a.length()),b)+2;
					if(temp1<result)
						result=temp1;
				}
			}
			int temp1=findMin("",b)+2;
			if(temp1<result)
				result=temp1;
			System.out.println(result);
		}
	}
	static int findMin(String a,String b){
		int result=0;
		int i=0;
		int j=0;
		while(i<a.length()&&j<b.length())
		{
			if(a.charAt(i)==b.charAt(j))
			{
				i++;
				j++;
				result+=2;
			}
			else
			{
				i++;
			}
		}
		if(j<b.length())
		{
			result+=(b.length()-j)+2;
		}
		return result;
	}
}
