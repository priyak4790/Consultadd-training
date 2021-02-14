package com.consultadd2;
import java.util.Scanner;

public class Operators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		    Scanner input= new Scanner(System.in);

		      float first,second,first1,second2,result;

		      System.out.println("Enter first number:");

		       first = input.nextFloat();

		       System.out.println("Enter second number:");

		       second = input.nextFloat();

		       System.out.println("Enter 1 for Addition,\n " 
		    		 + " 2 for Subtraction \n"  
		    		 + " 3 for Multiplication \n" 
		    		 + " 4 for Division \n " 
		    		 + " 5 for Average:");

		       int choice;

		       choice = input.nextInt();

		       switch (choice){

		       case 1: //calls add method to perform addition
		    	   result = first+second;
		    	   if(result<0)
		    	   {
		    		   System.out.println(" Oops option X(1/2/3/4/5) is returning the negative number ");
		    	   }
		    	   else {
		           System.out.println("Addition result = " + result);
		    	   }
		           break;

		       case 2: //calls sub method to perform subtraction
                   result = first-second;
                   if(result<0)
		    	   {
		    		   System.out.println(" Oops option X(1/2/3/4/5) is returning the negative number ");
		    	   }
		    	   else {
		          
                   System.out.println("Subtraction result = " + result);
		    	   }
		           break;      

		       case 3: //calls mul method to perform multiplication
                   result = first*second;
                   if(result<0)
		    	   {
		    		   System.out.println(" Oops option X(1/2/3/4/5) is returning the negative number ");
		    	   }
		    	   else {
		          
                   System.out.println("Multiplication result = " + result);
		    	   }
		           break;

		       case 4: //calls div method to perform division
                   result = first/second;
                   if(result<0)
		    	   {
		    		   System.out.println(" Oops option X(1/2/3/4/5) is returning the negative number ");
		    	   }
		    	   else {
		          
                   System.out.println("Division result = " + result);
		    	   }
		           break;

		       case 5: //calls average method to compute average 
		    	   
				     System.out.println("Enter first1 number:");

				       first1 = input.nextFloat();

				       System.out.println("Enter second2 number:");

				       second2 = input.nextFloat();

				       result = (first+second+first1+second2)/4;
				       if(result<0)
			    	   {
			    		   System.out.println(" Oops option X(1/2/3/4/5) is returning the negative number ");
			    	   }
			    	   else {
			          
				    System.out.println("Average = " + result);
			    	   }
		           break;

		       default: //if user enters anything other than the provided options

		               System.out.println("Invalid Option");
		               }
		       }

		   
	}


