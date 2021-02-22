package com.consultadd;

public class Program2SecondLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] arr = {10,30,60,20,40,50,40};
		int i;
	int max =arr[0];
	
		for(i=0;i<arr.length;i++)
		{
			if(arr[i]>max)
			{
				max=arr[i];
			}
		}
System.out.println(max);
}
}