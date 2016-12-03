package lll;

import java.util.Scanner;

public class tesr2
{
	static int gitMin(int num)
	{
		for(int i=2;i<=num;)//注意是小于等于
		{
			if(num%i == 0)
			{
				return i;
			}
			else 
			{
				i++;
			}
		}
		return num;
	}
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in); 
		while (true)
		{
			int a=s.nextInt();
			int b=s.nextInt();
			int k=s.nextInt();
			int count=0;
			for(int i=a;i<=b;i++)
			{
				if(i%k==0)
				{
					if(gitMin(i)==k)
					{
						count++;
					}
				}
			}
			System.out.println(count);
		}
   	 } 
}
