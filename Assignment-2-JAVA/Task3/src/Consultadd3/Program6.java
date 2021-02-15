package Consultadd3;

import java.util.Scanner;

public class Program6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n1,n2,n3;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter 1st number:");
		n1=sc.nextInt();
		System.out.println("Enter 2nd number:");
		n2=sc.nextInt();
		System.out.println("Enter 3rd number:");
		n3=sc.nextInt();
		
		if(n1<n2 && n2<n3)
		{
			System.out.println("INCREASING");
		}
		else if(n1>n2 && n2>n3)
		{
			System.out.println("DECREASING");
		}
		else 
		{
			System.out.println("Neither increasing or decreasing order");
		}
	}

}
