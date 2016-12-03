package com.bestwait.ceshi;

public class Copy_4_of_Main
{
	
	public static int name(int i)
	{
		try
		{
			i++;
			System.out.println(i);
			return i;
		} 
		catch (Exception e)
		{
			// TODO: handle exception
			return -1;
		}
		finally
		{
			i++;
		}
	}
	 public static void main(String[] args)
	 {
		 System.out.println(name(1));		
	 }
}