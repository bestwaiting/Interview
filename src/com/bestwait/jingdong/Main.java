package com.bestwait.jingdong;

import java.util.Scanner;
import java.io.*;
import java.util.*;
class Test {
}
public class Main
{
  public static void main(String args[])
  {
	  Scanner cin = new Scanner(System.in);  
	  String string = cin.nextLine();
	  int num=Integer.parseInt(string);
	  int[] result=new int[100001];
	  getValueAll(result);
	  for(int i=0;i<num;i++)
	  {
		  string=cin.nextLine();
		  System.out.println(result[Integer.parseInt(string)]);
	  }
  }
  public static void getValueAll(int[] result)
  {
	  int count=0;
	  result[0]=0;
	  for(int i=1;i<=100000;i++)
	  {
		  if(singleNum(i, 2)==singleNum(i, 10))
		  {
			  System.out.println(i);
			  result[i]=++count;
		  }
		  else 
		  {
			  result[i]=count;
		  }
	  }
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