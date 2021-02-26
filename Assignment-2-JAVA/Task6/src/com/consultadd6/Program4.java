package com.consultadd6;

public class Program4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Rectangle r = new Rectangle();
		Rectangle r1 = new Rectangle(2,4);
		Rectangle r2 = new Rectangle(2);
		
		System.out.println(r.calArea());
		System.out.println(r1.calArea());
		System.out.println(r2.calArea());
	}

}

 class Rectangle{
	
	 int length;
	 int breadth;
	 
	 public int calArea()
	 {
	
		 int area;
		 area = length*breadth;
		 
		 return area;
	 }
		 
		 Rectangle() {
			 this.length=0;
			 this.breadth=0;
		 }
		 Rectangle(int l,int b)
		 {
			 this.length=l;
			 this.breadth=b;
			 
		 }
		 
		 Rectangle(int l)
		 {
			 this.length=this.breadth=l;
		 }
	 }

