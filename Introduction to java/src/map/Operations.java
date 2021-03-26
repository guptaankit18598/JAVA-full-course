package map;

import java.util.*;
import java.util.Map.Entry;


public class Operations {

	public static void main(String[] args) {
		Map<String, Integer> num = new HashMap<>();
		num.put("one", 1);
		num.put("two", 2);
		num.put("five", 5);
		System.out.println(num.keySet());
		System.out.println(num.values());
		System.out.println(num);
		System.out.println(num.entrySet());
		Set<Entry<String,Integer>> entries = num.entrySet();
		for(Entry<String,Integer> entry: entries) {
			entry.setValue(entry.getValue() *100);
		}
		System.out.println(num);  
		
	}

}
