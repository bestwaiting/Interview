package com.bestwait.huawei;

import java.util.Scanner;

public class CopyOfCopyOfCopyOfMain
{
	static String a="";
	static String b="";
	public static void main(String args[]){
		Scanner cin = new Scanner(System.in);
		String temp=cin.nextLine();
		int num=Integer.parseInt(temp);
		
		for(int k=0;k<num;k++)
		{
			a=cin.nextLine();
			b=cin.nextLine();
			int la = a.length();
	        int lb = b.length();
	        int mi=4+lb;
	        int i,j;
	        for(i=0;i<lb;i++){
	            for(j=1;i+j-1<lb;j++){
	            	  int l = j;
	                  if(i>0&&i+j-1<lb-1)
	                	  mi=Math.min(f(i,i+j-1)+lb+4-l,mi);
	                  else 
	                	  if(l==lb)
	                		  mi=Math.min(f(i,i+j-1),mi);
	                	  else 
	                		  mi=Math.min(f(i,i+j-1)+lb+2-l,mi);
	            }
	        }
	        System.out.println(mi);
		}
		}
	static int f(int s,int t){
	    int i,j;
	    int la = a.length();
	    int lx = t-s+1;
	    int c=0,ti,tj;
	    j=s;
	    for(i=0;i<la;i++){
	        ti=i;
	        while(i<la&&j<=t&&a.charAt(i)==b.charAt(j)){
	            i++;
	            j++;
	        }
	        if(ti!=i){
	                c+=2;
	                if(ti==0){
	                    c-=2;
	                }
	        }
	        if(j==t+1)break;
	    }
	    if(i<=la-1)c+=2;
	    if(j<t+1)return 99999999;
	    return c;
	}

}
