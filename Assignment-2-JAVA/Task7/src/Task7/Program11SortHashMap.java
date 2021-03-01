package Task7;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Program11SortHashMap {

	static Map<String, Integer> map = new HashMap<>();
	
	public static void sortbykey() {
		
		TreeMap<String, Integer> sorted = new TreeMap<>();
		
		sorted.putAll(map);
		
		for(Map.Entry<String, Integer> entry : sorted.entrySet())
		{
			System.out.println("Key =" + entry.getKey() + ", Value=" + entry.getValue());	
		}
	}
	
	public static void main(String[] args) {
		
		map.put("def", 4); 
        map.put("abc", 6); 
        map.put("jkl", 8); 
        map.put("ghi", 3); 
        map.put("klm", 9); 
  
        sortbykey();

	}

}
