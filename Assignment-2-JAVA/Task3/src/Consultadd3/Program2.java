package Consultadd3;

import java.util.Scanner;

public class Program2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i;
		double sum=0;
		double avg;
		
		
		for(i=0;i<10;i++)
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter a number:");
			sum+=sc.nextInt();
			
		}
		System.out.println("Sum of numbers is :"+sum);
		
		avg=(sum/10);
		System.out.println("Average of numbers is:"+avg);
		
		}

}
