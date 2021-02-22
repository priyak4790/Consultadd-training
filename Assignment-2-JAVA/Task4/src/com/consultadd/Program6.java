package com.consultadd;
import java.util.Scanner;

public class Program6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String : ");
		String str = sc.nextLine();
		char ch;
		
		for(int i = 0; i < str.length(); i++) 
		{
			ch = str.charAt(i);
			
			if(Character.isUpperCase(ch))
				System.out.print(Character.toLowerCase(ch));
			else {
				System.out.print(Character.toUpperCase(ch));
			}
		}
	}
}
