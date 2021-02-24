package com.consultadd;

import java.util.Scanner;

public class Program7Difference {

	public static void main(String[] args) {
		
		
		int [] arr = {2,3,5,6,7,9,10};
		int i,max=arr[0],min=arr[0];
	
		
		for(i=0;i<arr.length;i++)
		{
				if(arr[i]<min) 
				min=arr[i];	
				
				if(arr[i]>max) 
					max=arr[i];
				
}
			System.out.println("Difference of largest and smallest element is :"+(max-min));	
		


	}

}
