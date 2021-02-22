package com.consultadd;
import java.lang.String;


public class Program1 {

	public static void main(String[] args) {
		String s = "Welcome to the training about java";
		String strArr[] = s.split(" ");
		String shortword = strArr[0];
		
		for(String a: strArr)
		{
			if(a.length() < shortword.length())
				shortword = a;
		}
		System.out.println("In the given string shortest word is :" +  shortword);
	}
}