package com.consultadd;

public class Program10ClosestToZero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {2,4,-7,5,1,-3,6};
	      int n = arr.length;
	      int i,j, min_sum, sum, min1, min2;
	      
	      min1 = 0;
	      min2 = 1;
	      min_sum = arr[0] + arr[1];
	      
	      for(i = 0; i < n - 1; i++)
	      {
	        for(j = i+1; j < n; j++)
	        {
	          sum = arr[i] + arr[j];
	          if(Math.abs(min_sum) > Math.abs(sum))
	          {
	            min_sum = sum;
	            min1 = i;
	            min2 = j;
	          }
	        }
	      }
	      
	      System.out.println("Two elements whose sum is minimum are "+
	                        arr[min1]+ " and "+arr[min2]);

	
	}

}
