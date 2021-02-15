package Consultadd3;
import java.util.Scanner;

public class Program7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		        Scanner input = new Scanner(System.in);

		        int numofdays = 0,num1,year; 
		        String Month = "Unknown";

		        System.out.print("Choose a number for month: ");
		         num1 = input.nextInt();

		        System.out.print("Enter the year: ");
		         year = input.nextInt();

		        switch (num1) {
		            case 1:
		                Month = "January";
		                numofdays = 31;
		                break;
		            case 2:
		                Month = "February";
		                if (year%4==0) 
		                {
		                    numofdays = 29;
		                } 
		                else
		                {
		                	numofdays = 28;
		                }
		                break;
		            case 3:
		                Month = "March";
		                numofdays = 31;
		                break;
		            case 4:
		                Month = "April";
		                numofdays = 30;
		                break;
		            case 5:
		                Month = "May";
		                numofdays = 31;
		                break;
		            case 6:
		                Month = "June";
		                numofdays = 30;
		                break;
		            case 7:
		                Month = "July";
		                numofdays = 31;
		                break;
		            case 8:
		                Month = "August";
		                numofdays = 31;
		                break;
		            case 9:
		                Month = "September";
		                numofdays = 30;
		                break;
		            case 10:
		                Month = "October";
		                numofdays = 31;
		                break;
		            case 11:
		                Month = "November";
		                numofdays = 30;
		                break;
		            case 12:
		                Month = "December";
		                numofdays = 31;
		        }
		        System.out.print(Month + " " + year + " has " + numofdays + " days\n");
		    }
		


	}


