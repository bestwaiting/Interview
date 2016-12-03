package com.bestwait.wangyi;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class test2
{
	 public static void sort(Map<String, Integer> map) {
	        List<String> strings = new LinkedList<String>();
	        List<Integer> integers = new LinkedList<Integer>();
	        for (String string : map.keySet()) {
	            strings.add(string);
	            integers.add(map.get(string));
	        }
	        for (int i = 0; i < integers.size(); i++) {
	            for (int j = i; j < integers.size(); j++) {
	                if (integers.get(i) < integers.get(j)) {
	                    swap(i, j, strings, integers);
	                }
	            }
	        }
	        for (int i = 0; i < strings.size(); i++) {
	        	System.out.println(strings.get(i));
	            
	        }
	    }

	    private static void swap(int i, int j, List<String> strings, List<Integer> integers) {
	        String string = strings.get(i);
	        strings.set(i, strings.get(j));
	        strings.set(j, string);
	        Integer integer = integers.get(i);
	        integers.set(i, integers.get(j));
	        integers.set(j, integer);
	    }
	
	
	
	
	
	
//	public static Map.Entry[] getSortedHashtableByValue(Map map) {
//		Set set = map.entrySet();
//		Map.Entry[] entries = (Map.Entry[]) set.toArray(new Map.Entry[set.size()]);
//		Arrays.sort(entries, new Comparator() {
//		public int compare(Object arg0, Object arg1) {
//		Long key1 = Long.valueOf(((Map.Entry) arg0).getValue().toString());
//		Long key2 = Long.valueOf(((Map.Entry) arg1).getValue().toString());
//		return key1.compareTo(key2); 
//		}
//		});
//		return entries;  
//		}
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in); 
   	 	String str ="";
   	 	Map<String, Integer> map =new HashMap<String, Integer>();
   	 	while(s.hasNext())
   	 	{
   	 		str = s.nextLine();
   	 		String[] numstr=str.split("\\|");
   	 		if(map.containsKey(numstr[3]))
   	 		{
   	 			map.put(numstr[3], map.get(numstr[3])+1);
   	 		}
   	 		else
   	 		{
				map.put(numstr[3], 1);
			}
   	 	}
   	 	sort(map);
//   	 	Map.Entry[] entries= getSortedHashtableByValue(map);
//   	 for(int i=0;i<entries.length;i++)
//	   	{
//   		 System.out.println(entries[i].getKey());
//	   	}
	}
}
