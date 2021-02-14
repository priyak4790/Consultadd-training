package com.consultadd2;
import java.util.Scanner;

public class Program6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter an integer:");
		n = sc.nextInt();
       if(n%2!=0)
       {
    	   System.out.println("NEW");
       }
    	   
       else if(n%2==0 && n>2 && n<5)  
    	   {
    		   System.out.println("OLD");
    	   }
    	   
    	   else if(n%2==0 && n>6 && n<30)
       {
    	   System.out.println("NEW");
       }
    	   else if(n>30)
    	   {
    		   System.out.println("OLD");
    	   }
       }
	}





