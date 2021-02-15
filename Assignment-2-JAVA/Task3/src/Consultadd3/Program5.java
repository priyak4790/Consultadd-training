package Consultadd3;

import java.util.Scanner;

public class Program5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		long l,sum=0;
		int count=0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number:");
		l = sc.nextLong();
		
		while(l!=0)
		{
			sum = sum + l % 10;
			l=l/10;
			count++;
			
		}
		System.out.println("Number of digits are:"+ count);
		System.out.println("Sum of digits is:"+sum);
		
		
	}

}
