package com.bestwait.toutiao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main
{

	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);  
		int m=cin.nextInt();
		int n=cin.nextInt();
		List<String> list=new ArrayList<>();
		for(int i=1;i<=m;i++)
		{
			list.add(String.valueOf(i));
		}
		Collections.sort(list);
		System.out.println(Integer.parseInt(list.get(n-1)));
	}
}
