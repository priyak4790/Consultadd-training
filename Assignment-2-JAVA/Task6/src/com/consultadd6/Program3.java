package com.consultadd6;

public class Program3 {

		
		public static void main(String[] args)
		{
			Student n1= new Student("John");
			Student n2= new Student("");
			
			}
	}

	class Student
	{
		String name;
		
		Student(String n1)
		{
			this.name = n1;
			System.out.println("Name is:"+ this.name);
		}
		
		Student()
		{
			this.name="unknown";
			System.out.println("Name is:"+ this.name);
		}
	}