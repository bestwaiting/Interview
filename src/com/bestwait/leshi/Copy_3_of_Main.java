package com.bestwait.leshi;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class Copy_3_of_Main
{
	 private static int M = 100000; //此路不通
	 public static void main(String[] args)
	 {
		Scanner cin = new Scanner(System.in);  
		Map<Integer, Integer> map=new HashMap<Integer, Integer>();
		int start=cin.nextInt();
		int count=0;
		int[][] weight2=new int[100][100];
		map.put(count++,start);
		int end=cin.nextInt();
		map.put( count++,end);
		while (cin.hasNext())
		{
			int num1=cin.nextInt();
			if(!map.containsValue(num1))
				map.put(num1, count++);
			int num2=cin.nextInt();
			if(!map.containsValue(num2))
				map.put(num2, count++);
			int value=cin.nextInt();
			weight2[map.get(num1)][map.get(num1)]=value;
			weight2[map.get(num2)][map.get(num1)]=value;
		} 
		for(int i=0;i<map.size();i++)
		{
			for(int j=0;j<map.size();j++)
			{
				if(i==j)
					weight2[i][j]=0;
				else
				{
					if(weight2[i][j]!=0)
						weight2[i][j]=M;
				}
			}
		}
	    dijkstra(weight2,map.get(start),map.get(end),map.size()); 
	 }
	public static void dijkstra(int[][] weight, int start,int end,int num) 
	{
		 int n = num;      //顶点个数
		 int[] shortPath = new int[n];  //保存start到其他各点的最短路径
		 String[] path = new String[n];  //保存start到其他各点最短路径的字符串表示
		 for(int i=0;i<n;i++) 
		  path[i]=new String(start+"-->"+i); 
		 int[] visited = new int[n];   
		  
		 shortPath[start] = 0;
		 visited[start] = 1;
		  
		 for(int count = 1; count < n; count++) {   //要加入n-1个顶点
		  int k = -1;        //选出一个距离初始顶点start最近的未标记顶点 
		  int dmin = Integer.MAX_VALUE;
		  for(int i = 0; i < n; i++) {
		  if(visited[i] == 0 && weight[start][i] < dmin) {
		   dmin = weight[start][i];
		   k = i;
		  }
		  }
		  shortPath[k] = dmin;
		  visited[k] = 1;
		  for(int i = 0; i < n; i++) {
		  if(visited[i] == 0 && weight[start][k] + weight[k][i] < weight[start][i]) {
		   weight[start][i] = weight[start][k] + weight[k][i];
		   path[i] = path[k] + "-->" + i; 
		  }
		  }
		 }
		  System.out.println(path[end]+"("+shortPath[end]+")");
		 }
}