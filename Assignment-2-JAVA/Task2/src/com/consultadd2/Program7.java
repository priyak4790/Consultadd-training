package com.consultadd2;

import java.util.Scanner;

public class Program7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float n;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number:");
		n = sc.nextFloat();

		if(n==0)
		{
			System.out.println("ZERO");
		}
		else if(n>0)
		{
			System.out.println("Positive");
		}
		else if(n<0)
		{
			System.out.println("Negative");
		}
		
		
		if(Math.abs(n) < 1) 
		{
			System.out.println("Small");
		}
		else if (Math.abs(n) > 1000000)
		{
			System.out.println("Large");
		}
		
	}

}
