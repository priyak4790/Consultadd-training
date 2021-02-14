package com.consultadd2;

import java.util.Scanner;

public class Program8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			char ch;
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter a character:");
			ch = sc.next().charAt(0);
			 ch = Character.toLowerCase(ch);

		        if(ch=='r' || ch=='a' || ch=='n'|| ch=='d'|| ch=='o'|| ch=='m' )
		        {
		            System.out.println("FOUND.");
		        }
		        else
		            System.out.println("NOT FOUND.");

	}

}
