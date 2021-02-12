package com.consultadd;
import java.util.Scanner;

public class AddUsingScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x,y,z;
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter any TWO number between 1-10");


	        System.out.println("Enter the first number");
	        x = sc.nextInt();

	        
	        System.out.println("Enter the second number");
	        y = sc.nextInt();
	        
	        z = x+y;
	        z += 30;
	        
	        System.out.println("The final value is : "+z);
	        
	     


	}

}
