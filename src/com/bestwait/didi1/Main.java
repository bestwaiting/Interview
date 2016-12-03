package com.bestwait.didi1;

import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		Scanner cin = new Scanner(System.in);  
		while (cin.hasNext())
		{
			String string = cin.nextLine();
			string=string.substring(2);
			System.out.println(Integer.parseInt(string,16));
		}
	}
	
	
	public static int HexToInt(String strHex){  
        int nResult = 0;   
        String str = strHex.toUpperCase();   
        str = str.substring(2);  
        int nLen = str.length();  
        for ( int i=0; i<nLen; ++i ){  
            char ch = str.charAt(nLen-i-1);  
            try {  
                nResult += (GetHex(ch)*GetPower(16, i));  
            } catch (Exception e) {  
                // TODO Auto-generated catch block  
                e.printStackTrace();  
            }  
        }  
        return nResult;  
    }  
	   //计算幂  
    public static int GetPower(int nValue, int nCount) throws Exception{  
        if ( nCount <0 )  
            throw new Exception("nCount can't small than 1!");  
        if ( nCount == 0 )  
            return 1;  
        int nSum = 1;  
        for ( int i=0; i<nCount; ++i ){  
            nSum = nSum*nValue;  
        }  
        return nSum;  
    } 
    //计算16进制对应的数值  
    public static int GetHex(char ch) throws Exception{  
        if ( ch>='0' && ch<='9' )  
            return (int)(ch-'0');  
        if ( ch>='a' && ch<='f' )  
            return (int)(ch-'a'+10);  
        if ( ch>='A' && ch<='F' )  
            return (int)(ch-'A'+10);  
        throw new Exception("error param");  
    }  
      
}
