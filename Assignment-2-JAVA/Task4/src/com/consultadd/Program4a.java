package com.consultadd;

public class Program4a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "Be Happy and Stay Motivated";
		String [] strArray = str.split(" ");
		String reverseArr = " ";
		
		
		for(String s: strArray) {
			StringBuffer sb = new StringBuffer(s);
			sb.reverse();
			//reverseArr+=sb.toString() + " ";  
			reverseArr = reverseArr + sb.toString() + " ";
			
		}
		
		System.out.println("Reverse Sentence:" + reverseArr);
	}
}