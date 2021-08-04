package SortedHashMap;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class hashMapSorted {

	public static void main(String[] args) {
		
		
		String a = "Name";
		String b = "Bangladesh";

		HashMap <String, String > hm = new HashMap<>();
		
		hm.put(a, "Name");
		hm.put(b, "Bangladesh");
		
		/*
		 * System.out.println(hm.get(a)); 
		 * System.out.println(hm.get(b));
		 */

		TreeMap <String, String > tm = new TreeMap<>(hm);
		
		for(Map.Entry<String, String>entry:tm.entrySet()) 
		
		{
			System.out.println(entry.getValue());
		}
		
		LinkedHashMap<String, String> lhm = new LinkedHashMap<>(hm);
		
		for(Map.Entry<String, String>entry:lhm.entrySet()) 
		
		{
			System.out.println(entry.getValue());	
		}
	}

}
