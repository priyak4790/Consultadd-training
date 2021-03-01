package Task7;

import java.util.Scanner;

public class Program1ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the string to be reversed:");
		str = sc.next();
		
		StringBuilder sb = new StringBuilder(str);
		sb= sb.reverse();
		System.out.println("the string is "+sb);
	}

}
