package com.bestwait.youdao;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class first
{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in); 
		int nums=s.nextInt();
		Queue<Integer> queue=new LinkedList<Integer>();
		for(int j=0;j<nums;j++)
		{
			int n=s.nextInt();
			while(!queue.isEmpty())
				queue.poll();
			for(int i=n;i>=1;i--)
			{
				queue.add(i);
				int tmp=queue.peek();
				queue.poll();
				queue.add(tmp);
			}
			while(!queue.isEmpty()){
				System.out.print(queue.poll());
				queue.poll();
				if(queue.isEmpty())
					System.out.println();
				else System.out.print(" ");
			}
		}
	}
}
