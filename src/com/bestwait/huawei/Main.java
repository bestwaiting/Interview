package com.bestwait.huawei;

import java.util.Scanner;

public class Main
{
	public static void main(String args[]){  
        
        Scanner cin = new Scanner(System.in);  
        String str=cin.nextLine();  
        String[] lele=str.split("[\\D]");  
        int[] nums=new int[lele.length];  
        int count=0;  
        for (int i = 0; i < lele.length; i++)  
        {  
            if(!lele[i].equals(""))  
                nums[count++]=Integer.parseInt(lele[i]);  
        }  
        bubSwapSort(nums,count);  
        for (int i = 0; i < count; i++) {  
            System.out.print(nums[i]+" ");  
        }  
    }  
    static void bubSwapSort(int []array,int count){  
        int i,j,temp;  
        Boolean flag=false;  
        for (i = 0; i < count; i++) {  
            flag=true;  
            for(j=0;j<count-i-1;j++){  
                if(array[j+1]>array[j])  
                {  
                    temp=array[j+1];  
                    array[j+1]=array[j];  
                    array[j]=temp;  
                    flag=false;  
                }  
            }  
            if(flag)  
                break;  
        }  
    }  
}
