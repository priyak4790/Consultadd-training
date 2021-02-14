package com.consultadd2;
import java.util.Scanner;

public class DivisibleNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter any number:");
        n = s.nextInt();
        if(n % 3 == 0)
        {	
         if(n%5==0)
        	System.out.println(" Consultadd Java Training");
        		else 
        			System.out.println("Consultadd");
        }
        	 else if(n%5==0)
        	 {
        		 System.out.println("Java training");
        	 }
	}

}
