package com.consultadd;

public class SwapTwoNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 100, y = 200; 
		  
        System.out.println("Before Swap"); 
        System.out.println("x = " + x); 
        System.out.println("y = " + y); 
  
        int temp = x; 
        x = y; 
        y = temp; 
  
        System.out.println("After swapping with third variable"); 
        System.out.println("x = " + x); 
        System.out.println("y = " + y); 

        x = x + y;  
		  y = x - y;  
		  x = x - y;  
		  
		  System.out.println("After swapping without third variable"); 
	        System.out.println("x = " + x); 
	        System.out.println("y = " + y);
		  
	}

}
