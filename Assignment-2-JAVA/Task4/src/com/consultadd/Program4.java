package com.consultadd;

import java.util.Arrays;

public class Program4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "WElcome";
		
		System.out.println(isogram(str));
	}
		
	public static boolean isogram(String str){
		
		str = str.toLowerCase();
		char[]ch = str.toCharArray();
		
		Arrays.sort(ch);
	
		for (int i=0;i<ch.length-1;i++)
		{
				if(ch[i]==ch[i+1])
					return false;
			}
		return true;
}
}

