package Consultadd3;
import java.util.Scanner;

public class Program4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*int n,total=0,count;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number n:");
		n=sc.nextInt();
		sc.close();
		
		for(count=1;count<n;count++)
		{
			total=total+count;
			
			
		}
		System.out.println("The n numbers are:"+n);
		System.out.println("The sum of n numbers is:"+total);*/
		
int num, count, total = 0;

        
        System.out.println("Enter the value of n:");
        //Scanner is used for reading user input
        Scanner scan = new Scanner(System.in);
        //nextInt() method reads integer entered by user
        num = scan.nextInt();
        //closing scanner after use
        scan.close();
        for(count = 1; count <= num; count++){
            total = total + count;
            System.out.println(count + "\t");
        }

        System.out.println("Sum of first "+num+" natural numbers is: "+total);

		

	}

}
