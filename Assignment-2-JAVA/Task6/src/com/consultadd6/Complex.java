package com.consultadd6;

public class Complex

{
      double a,b;
     
   Complex(double r, double i){
	this.a = r;
	this.b = i;
   }
	
       public static void main(String args[]) {
	Complex c1 = new Complex(5.5, 4);
	Complex c2 = new Complex(1.2, 3.5);
        Complex temp = sum(c1, c2);
        Complex temp1= difference(c1,c2);
        Complex temp2 = product(c1,c2);
        System.out.printf("Sum is: "+ temp.a+" + "+ temp.b +"i");
        System.out.println("\nDifference is: "+ temp1.a + " - " + temp1.b + "i");
        System.out.println("\nProduct is: "+ temp2.a + " * " + temp2.b + "i");
    }
   
       public static Complex sum(Complex c1, Complex c2)
       {
    	
            Complex temp = new Complex(0, 0);

            temp.a = c1.a + c2.a;
            temp.b = c1.b + c2.b;
            
            
            return temp;
        }

    public static Complex difference(Complex c1, Complex c2)
    {
 	
         Complex temp1 = new Complex(0, 0);

         temp1.a = c1.a - c2.a;
         temp1.b = c1.b - c2.b;
         
         
         return temp1;
     }
    public static Complex product(Complex c1, Complex c2)
    {
 	
         Complex temp2 = new Complex(0, 0);

         temp2.a = c1.a * c2.a;
         temp2.b = c1.b * c2.b;
         
         
         return temp2;
     }
}