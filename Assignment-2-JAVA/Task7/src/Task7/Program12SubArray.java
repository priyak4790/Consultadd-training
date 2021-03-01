package Task7;

import java.util.Scanner;

public class Program12SubArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n,i,j=0;
		int arr[]= {2,3,4,1,5,6};
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		n = sc.nextInt();
		
		for(i=0;i<arr.length;i++)
		{
			for(j=0;j<arr.length;j++)
			
			{
			if(arr[i]+arr[j]==n)
			{
				System.out.println(" The numbers are:" + arr[i] + " and " +arr[j]);
			}
		}
	}

	}
}
