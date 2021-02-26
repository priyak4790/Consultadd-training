package com.consultadd6;

public class Program6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Programming p1 = new Programming();
		Programming p2 = new Programming("Java");
	}

}

class Programming
{
	String s;
	
	Programming(){
		System.out.println("I love programming languages");
	}
	
	Programming(String s)
	{
		this.s=s;
		System.out.println("I love " + this.s);
		
	}
}