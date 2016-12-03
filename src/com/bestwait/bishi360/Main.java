package com.bestwait.bishi360;

import java.util.Arrays;
import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		Scanner cin = new Scanner(System.in);  
		while (cin.hasNext())
		{
			String string = cin.nextLine();
			String[] str=string.split(" ");
			int T=Integer.parseInt(str[0]);
			int maxMem=Integer.parseInt(str[1]);
			int[] maxMemFlag=new int[10001];
			int count=0;
			int[] countFlag=new int[T+1];
			int useVa=maxMem;
			for(int i=0;i<T;i++)
			{
				String temp=cin.nextLine();
				String[] opString=temp.split(" ");
				switch (opString[0])
				{
					case "new":
						int num=Integer.parseInt(opString[1]);
						if(num>useVa)
						{
							System.out.println("NULL");
						}
						else
						{
							int ll=newOP(maxMemFlag, num);
							if(ll>0)
							{
								count++;
								countFlag[count]=ll;
								System.out.println(count);
							}
							else
							{
								System.out.println("NULL");
							}
						}
						break;
					case "del":
						int num1=Integer.parseInt(opString[1]);
						if(countFlag[num1]>0)
						{
							int delNum=maxMemFlag[countFlag[num1]];
							useVa+=delNum;
							for(int k=0;k<delNum;k++)
							{
								maxMemFlag[countFlag[num1]+k]=0;
							}
						}
						else 
						{
							System.out.println("ILLEGAL_OPERATION");
						}
						break;
					case "def":
						
						break;
					default:
						break;
				}
				
			}
			System.out.println(Integer.parseInt(string,16));
		}
	}
    public static int newOP(int[] maxMemFlag,int num)
	{
    	for(int i=1;i<=maxMemFlag.length-1;i++)
    	{
    		int flag=i;
    		int total=0;
    		while (i<=maxMemFlag.length-1&&maxMemFlag[i]==0)
			{
				total++;
				i++;				
			}
    		if(total==num)
    		{
    			for(int j=0;j<num;j++)
    				maxMemFlag[flag+j]=total--;
    			return flag;
    		}
    		i+=maxMemFlag[i];
    	}
		return -1;
	}  
    public static int defOP(int[] maxMemFlag,int[] countFlag)
	{
    	int[] temp= new int[countFlag.length];
    	int count=Integer.MAX_VALUE;
    	int flag=0;
    	int index=1;
    	for(int i=1;i<=countFlag.length-1;i++)
    	{
    		if(countFlag[i]>0&&countFlag[i]<count)
    		{
    			count=countFlag[i];
    			flag=i;
    		}
    	}
    	
		return -1;
	}  
}
