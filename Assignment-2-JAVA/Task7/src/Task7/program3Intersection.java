package Task7;

public class program3Intersection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[]a1 = {1,2,3,4,5};
		int[]a2 = {5,4,6,7,8,9};
		int i,j,temp=0;
		
		for(i=0;i<a1.length;i++)
		{
			for(j=0;j<a2.length;j++)
			{
				if(a1[i]==a2[j])
				{
					System.out.println("The intersection of the array is :"+ a2[j]);
				}
			}
		}
		
		
	}

}
