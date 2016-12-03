package com.bestwait.xiaomi;

import java.util.Scanner;


public class Main
{
	 public static void main(String[] args)
	 {
		Scanner cin = new Scanner(System.in);  
		String[] number =  {"ZERO", "XSI", "GEIHT", "SEVEN", "UFOR", "RTHEE", "WTO",
				"ONE", "FIVE", "INNE"};
		int charTint[] = { 0, 6, 8, 7, 4, 3, 2, 1, 5, 9 };
		int[] ch=new int[256];
		int[] num=new int[10];
		int n=Integer.parseInt(cin.nextLine());
		for(int k=0;k<n;k++)
		{
			String s=cin.nextLine();
			for(int i=0;i<s.length();i++)
			{
				ch[s.charAt(i)]++;
			}
			for (int i = 0; i < 10; i++){
				int cnt = ch[number[i].charAt(0)];
				num[charTint[i]] = cnt;
				for(int j=0;j<number[i].length();j++)
				{
					ch[number[i].charAt(j)]-=cnt;
				}
			}
			for (int i = 0; i < 10; i++){
				while (num[(i+8)%10]>0){
					System.out.print(i);
					num[(i + 8) % 10]--;
				}
			}
			System.out.println();
		}

	 }
}