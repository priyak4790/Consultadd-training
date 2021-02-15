package Consultadd3;

import java.util.Scanner;

public class Program8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int year;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the year:");
		year = sc.nextInt();
		if(year%4==0)
		{
			System.out.println("Leap Year");
		}
		else
		{
			System.out.println("Not leap year");
		}
	}

}
