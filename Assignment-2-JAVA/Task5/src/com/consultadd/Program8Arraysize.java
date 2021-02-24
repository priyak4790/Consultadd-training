package com.consultadd;

public class Program8Arraysize {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int A[] = {1,1,2,3,3,3,4,4,5};  
		System.out.println("The length of the array is: "+A.length);
		System.out.print("The array elements are: ");
       for (int i = 0; i < A.length; i++)
        {
            System.out.print(A[i]+" ");
        }
		System.out.println("\nThe new length of the array is: "+array_sort(A));
			
    }
    
    public static int array_sort(int[] A) {
         int j = 1;
        for (int i = 0; i < A.length; i++) {
            if (A[i] != A[j-1])
                A[j++] = A[i];
        }
	  return j;

}

}

