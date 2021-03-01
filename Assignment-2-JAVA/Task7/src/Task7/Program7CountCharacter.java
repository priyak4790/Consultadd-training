package Task7;

import java.util.HashMap;

public class Program7CountCharacter {

	private static void characterCount(String inputString)
    {
       
  
        HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
  
        
  
        char[] strArray = inputString.toCharArray();
  
       
  
        for (char c : strArray)
        {
            if(hm.containsKey(c))
            {
  
                hm.put(c, hm.get(c)+1);
            }
            else
            {
  
                hm.put(c, 1);
            }
        }
        
  
        System.out.println(inputString+" : "+hm);
    }
  
    public static void main(String[] args)
    {
       characterCount("aabbbbggghhhhhh");
  
  
    }
}