package Task7;

import java.util.Scanner;

public class Unique {

		
		boolean uniqueCharacters(String str)
	    {
	       
	        for (int i = 0; i < str.length(); i++)
	            for (int j = i + 1; j < str.length(); j++)
	                if (str.charAt(i) == str.charAt(j))
	                    return false;
	 
	        
	        return true;
	    }
	 
	    public static void main(String args[])
	    {
	    	
	    	String s;
	    	Scanner sc = new Scanner(System.in);
	    	System.out.println("Enter the string :");
	    	s = sc.next();
	        Unique obj = new Unique();
	        
	 
	        if (obj.uniqueCharacters(s))
	            System.out.println("The String " + s + " has all unique characters");
	        else
	            System.out.println("The String " + s + " has duplicate characters");
	    }
	
		
	
}
