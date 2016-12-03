package com.bestwait.huawei;

import java.util.Scanner;

public class CopyOfMain
{
	public static void main(String args[]){
		Scanner cin = new Scanner(System.in);
		String str=cin.nextLine();
		String[] temp=str.split(",");
		int num=Integer.parseInt(temp[0]);
		int n=Integer.parseInt(temp[1]);
		toBinary(num,n);
	}
	static void toBinary( int num,int n){
        int r;
        r = num%n;
        if(num>=n)
        {             
            toBinary(num/n,n);
        }
        System.out.print(r);
	}
}
