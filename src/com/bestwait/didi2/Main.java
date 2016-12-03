package com.bestwait.didi2;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Vector;

public class Main
{
	final static int inf = Integer.MAX_VALUE;
	static int[][] board=new int[12][12];
	static int[][] dis=new int[12][12];
	static int[][] prex=new int[12][12];
	static int[][] prey=new int[12][12];
	static int n;
	static int m;
	static int p;
	static int[][] ne=new int[][]{{-1,0},{0,1},{1,0},{0,-1}};
	static int[] va = new int[]{ 3, 1, 0, 1 };

	static void dfs(int x, int y)
	{
		if (x == 0 && y == m - 1)
			return;
		for (int i = 0; i < 4; i++)
		{
			int nx = x + ne[i][0];
			int ny = y + ne[i][1];
			if (nx >= 0 && nx < n&&ny >= 0 && ny < m&&board[nx][ny]==1)
			{
				if (dis[nx][ny]>dis[x][y] + va[i])
				{
					dis[nx][ny] = dis[x][y] + va[i];
					prex[nx][ny] = x;
					prey[nx][ny] = y;
				}
				board[nx][ny] = 0;
				dfs(nx, ny);
				board[nx][ny] = 1;
			}
		}
	}
	public static void main(String[] args)
	{
		Scanner cin = new Scanner(System.in); 
		String str=cin.nextLine();
		String[] temp=str.split(" ");
		n=Integer.parseInt(temp[0]);
		m=Integer.parseInt(temp[1]);
		p=Integer.parseInt(temp[2]);
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<m;j++)
			{
				board[i][j]=cin.nextInt();
				dis[i][j] = inf;
				prex[i][j] = -1;
				prey[i][j] = -1;
			}
		}
		board[0][0] = 0;
		dis[0][0] = 0;
		dfs(0, 0);
		
		if (dis[0][m - 1] > p)
		{
			System.out.println("Can not escape!");
		}
		else
		{
			ArrayList<Integer> ansx=new ArrayList<>();
			ArrayList<Integer> ansy=new ArrayList<>();
			//Vector<Integer> ansx= new Vector<>();
			//Vector<Integer> ansy= new Vector<>();
			int x = 0, y = m - 1, nx, ny;
			do{
				ansx.add(x);
				ansy.add(y);
				nx = prex[x][y];
				ny = prey[x][y];
				x = nx;
				y = ny;
				
			} while (x != -1);
			for (int i = ansx.size()-1; i >= 0; i--)
			{
				System.out.print("["+ansx.get(i)+","+ansy.get(i)+"]");
				if (i > 0)
					System.out.print(",");
			}
		}
	}
	
}



