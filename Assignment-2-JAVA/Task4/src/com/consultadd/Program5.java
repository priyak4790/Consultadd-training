package com.consultadd;

public class Program5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	int i,j;
		int [] a1 = {23,25,75,87,47,1,92,51,23};
		int [] b1 = {22,44,64,76,98,12,43,54,90};
		
		for ( i=0;i<a1.length-1;i++)
		{
			if((a1[i]%2) == 0) 
				break;
		}
		System.out.println("The even from the array is :"+a1[i]); 
		
		for ( j=0;j<b1.length-1;j++)
		{
			if((b1[j]%2) != 0) 
				break;
		}
		
		System.out.println("The odd from the array is :"+b1[j]);
		
		
	}

}
