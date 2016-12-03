package com.bestwait.xiaomi;

import java.util.Arrays;
import java.util.Scanner;


public class Copy_5_of_Main
{
	 public static void main(String[] args)
	 {
		Scanner cin = new Scanner(System.in);  
		int n=cin.nextInt();
		int[] tree=new int[n];
		Arrays.fill(tree,-1);
		for(int i=0;i<n-1;i++)
		{
			int num1=cin.nextInt();
			int num2=cin.nextInt();
			tree[num2]=num1;
		}
		System.out.println(MaxDepth(tree));
	 }
	 public static int  MaxDepth(int[] tree)
	{
		int[] depth=new int[tree.length];
		Arrays.fill(depth,-1);
		int result=0;
		for(int i=0;i<tree.length;i++)
		{
			if(depth[i]==-1)
				result=Math.max(result, findDepth(i, depth, tree));
		}
		return result;
	}
	 public static int findDepth(int i,int[] depth,int[] tree)
	{
		if(depth[i]!=-1)
			return depth[i];
		if(tree[i]==-1)
			depth[i]=1;
		else 
		{
			depth[i]=1+findDepth(tree[i], depth, tree);
		}
		return depth[i];
	}
}