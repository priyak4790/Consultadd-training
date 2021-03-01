package Task7;

public class Armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			    int num=153;
			    int c=0,a,temp;
			    temp=num;  
			    while(num>0)  
			    {  
			    a=num%10;  //3, 5, 1
			    num=num/10;  //15, 1, 0
			    c=c+(a*a*a);  //27, 152, 153
			    
			    }  
			    if(temp==c)  
			    System.out.println("armstrong number");   
			    else  
			        System.out.println("Not armstrong number");   
			   }  
			}  
	
