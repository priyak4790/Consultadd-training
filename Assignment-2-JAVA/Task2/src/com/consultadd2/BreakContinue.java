package com.consultadd2;
import java.util.Scanner;

public class BreakContinue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int n;
       Scanner sc = new Scanner(System.in);
       
      while (true)
      {
    	  System.out.println("Enter the number:");
    	  n = sc.nextInt();
    	  if(n<0)
    	  {
    	  System.out.println("Its over");
    	  break;
      }
    	  else
    	  {
    	  System.out.println("Going good");
    	  continue;
    	  } 
      }
	}
	
}

