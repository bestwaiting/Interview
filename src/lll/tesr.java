package lll;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class tesr
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in); 
   	 int t=s.nextInt();
   	 for(int i=0;i<t;i++)
   	 {
   		 int n=s.nextInt();
   		 int count =Integer.MIN_VALUE;
   		 String result="";
   		 Map<String, Integer> map =new HashMap<>();
   		 for(int j=0;j<n;j++)
   		 {
   			 String name=s.next();
   			 int score=s.nextInt();
   			 if(map.containsKey(name))
   			 {
   				 int temp=map.get(name);
   				 if(temp+score>count)
   				 {
   					 count=temp+score;
   					 result=name;
   				 }
   				 map.put(name, temp+score);
   			 }
   			 else
   			 {
   				 if(score>count)
   				 {
   					 count=score;
   					 result=name;
   				 }
   				 map.put(name, score);
				}
   		 }
   		 System.out.println(result);
   	 } 
	}

}
