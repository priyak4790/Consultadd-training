package com.consultadd;

import java.util.Arrays;

public class Program3SecondSmallest {

	public static int secondsmallest(int arr1[], int n) {
		// TODO Auto-generated method stub

		
		n= arr1.length;
		int temp;
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(arr1[i]>arr1[j])
				{
					temp = arr1[i];
					arr1[i]=arr1[j];
					arr1[j]=temp;
					
				}
			}
		}
		
		return arr1[1];
		
	}
		public static void main(String[] args) {
		
			int arr1[] = {2,4,2,5,1,3,6,7};
			System.out.println("Second smallest :"+ secondsmallest(arr1,8));
	}

}
