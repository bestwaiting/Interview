package com.bestwait.youdao;

import java.util.Scanner;

public class second
{
	public static void main(String[] args)
	{
		int T;
		Scanner scan = new Scanner(System.in);
		T = scan.nextInt();
		int n,k;
		int[] a = new int[205];
		int[] b = new int[205];
		while(T--!=0){
			n = scan.nextInt();
			k = scan.nextInt();
			for(int i=0;i<2*n;i++){
				a[i] = scan.nextInt();
			}
			while(k--!=0){
				for(int i=0;i<n;i++){
					b[i*2] = a[i];
				}
				for(int i=n;i<2*n;i++){
					b[(i-n)*2+1] = a[i];
				}
				for(int i=0;i<2*n;i++){
					a[i]=b[i];
				}
			}
			StringBuffer reBuffer=new StringBuffer();
				for(int i=0;i<2*n;i++){
					reBuffer.append(a[i]);
					reBuffer.append(" ");
				}
				System.out.println(reBuffer.substring(0, reBuffer.length()-1));
			
		}
	}

}
