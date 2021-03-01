package Task7;

import java.util.Scanner;

public class Program2NonRepeated {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str;
		int i=0,j=0;
		char temp= 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the string:");
		str = sc.next();
		
		char [] c = str.toCharArray();
		
		
		for(i=0;i<c.length;i++)
		{
			for(j=i+1;j<c.length;j++)
			{
				if(c[i]==c[j])
				{
					temp=c[j];
				}
			}
		}
				System.out.println(temp);

	}

}
