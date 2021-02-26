package com.consultadd6;

public class Employee {
	
	String name;
	int year_of_joining;
	String address;

	public static void main(String[] args) {
		
		Employee n1= new Employee();
		Employee n2= new Employee();
		Employee n3= new Employee();
		
		n1.name="Robert";
		n1.year_of_joining=1994;
		n1.address="64C- Walls Streat";
		
		System.out.println("Name    Year of joining     Address");
		System.out.println(n1.name +"\t"+ n1.year_of_joining + "\t\t" + n1.address);
		
		n1.name="Sam";
		n2.year_of_joining=2000;
		n2.address="68D- Walls Streat";
		
		System.out.println(n2.name +"\t"+ n2.year_of_joining + "\t\t" + n2.address);
	
		n3.name="John";
		n3.year_of_joining=1999;
		n3.address="26B- Walls Streat";
		
		System.out.println(n3.name +"\t"+ n3.year_of_joining + "\t\t" + n3.address);
	
	}

}
