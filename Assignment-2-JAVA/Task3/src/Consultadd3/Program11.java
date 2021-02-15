package Consultadd3;

import java.util.Scanner;

public class Program11 {

	public static void main(String[] args) { 
	 Scanner sc = new Scanner(System.in); 
	 
	 System.out.print("Input first floating­point number: "); 
	 double n1 = sc.nextDouble(); 
	 
	 System.out.print("Input second floating­point number: "); 
	 double n2 = sc.nextDouble();  
	  
	 if (Math.abs(n1 - n2) <= 0.01)
	 { 
	     System.out.println("These numbers are the same."); 
	 } 
	 else
	 { 
	     System.out.println("These numbers are different."); 
	 } 
	    
	}

}


