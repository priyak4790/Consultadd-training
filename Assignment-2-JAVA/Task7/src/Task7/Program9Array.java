package Task7;

import java.util.Arrays;

public class Program9Array {

	public static void main(String[] args) {
	
		int [] arr = {4,7,8,3,5,2,1,9};
		int i,j,max=0;
		
		Arrays.sort(arr);
		
		for(i=0;i<arr.length;i++)
		{
			for(j=0;j<arr.length;j++)
			{
				if(arr[i]>max)
				max=arr[i];
			}
		}

		System.out.println(max);
	}

}
