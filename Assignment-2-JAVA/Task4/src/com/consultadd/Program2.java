package com.consultadd;

public class Program2 {
	
	public static void main(String[] args) {

		int [] a = {10,20,30,40,50,60};
		int smallindex=0, largeindex=0,sum=0;
		
		
		for(int i=0;i<a.length;i++)
		{
		for(int j=i+1;j<a.length;j++)
		{
			if(a[i]<a[j])
		
				smallindex=j;
			
		}
		}
	
		
		for(int i=0;i<a.length;i++)
		{
			for( int j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				
				largeindex = j;		
				}
		}
		
		for(int i=0;i<a.length;i++)
		{
				if(i==smallindex || i==largeindex) 
					continue;
				sum+=a[i];
		}
		
		System.out.println(sum);	
			}
	
	
	
	
	
		
	

}
