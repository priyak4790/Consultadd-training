package com.consultadd6;

public class program5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AddAmount am1 = new AddAmount();
		AddAmount am2 = new AddAmount(100);
		
	}

}

class AddAmount{
	 int amount=50;
	 int count=0;
	 
	 AddAmount()
	 {
		 this.amount=amount;
	 }
	 

	AddAmount(int newamount){
		 
		 this.amount+=newamount;
	
		 System.out.println("The total amount is:"+this.amount);
		 System.out.println("The number of transactions are :"+ ++count);	 	
	}
	
	 
}