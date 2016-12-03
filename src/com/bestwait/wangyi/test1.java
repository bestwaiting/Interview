package com.bestwait.wangyi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class test1
{
	public static List<List<Integer>> child(int[] nums) {
		 List<List<Integer>> res = new ArrayList<List<Integer>>();
	        List<Integer> temp = new ArrayList<Integer>();
	        int start = 0;
	        Arrays.sort(nums);
	        btChild(res,temp,start,nums);
	        return res;

        
    }
	static void btChild(List<List<Integer>> res, List<Integer> temp,int start, int[] nums) 
	{
		res.add(new ArrayList<Integer>(temp));
		for(int i=start;i<nums.length;i++){
			temp.add(nums[i]);
			btChild(res, temp, i+1, nums);
			temp.remove(temp.size()-1);
			if(i>start&&nums[i]==nums[i-1])
				continue;
		}
	}
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in); 
   	 	String str = s.next();
   	 	String[] numstr=str.split(",");
   	 	int[] nums=new int[numstr.length];
   	 	for(int i=0;i<numstr.length;i++)
   	 	{
   	 		nums[i]=Integer.parseInt(numstr[i]);
   	 	}
   	 	List<List<Integer>> result=child(nums);
   	 	Collections.sort(result,new Comparator<List<Integer>>(){
         public int compare(List<Integer> arg0, List<Integer> arg1) {
             return arg0.size()-arg1.size();
         }
   	 	});
		for (List<Integer> list : result)
		{
			StringBuffer tempBuffer=new StringBuffer();
			tempBuffer.append("[");
			for (Integer integer : list)
			{
				tempBuffer.append(integer+", ");
			}
			if(tempBuffer.length()>1)
				tempBuffer.delete(tempBuffer.length()-2, tempBuffer.length());
			tempBuffer.append("]");
			System.out.println(tempBuffer.toString());
		}
	}
}
