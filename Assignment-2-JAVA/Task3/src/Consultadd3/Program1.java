package Consultadd3;

import java.util.Scanner;

public class Program1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i=1,n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		n = sc.nextInt();
		
		while(i<=10)
		{
			//System.out.println("n" +n  "i" + i "=" "(n * i)");
			System.out.printf("%d * %d = %d \n", n, i, n * i);

				i++;	
		}
	}

}
