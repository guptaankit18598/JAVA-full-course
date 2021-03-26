package map;

import java.util.*;

public class StringAnagrams {

	public static void main(String[] args) {
		String[] str = {"eat", "ate", "tea", "god" , "dog"};
		List<List<String>> result = groupAnagrams(str);
		result.forEach(t -> System.out.println(t));
	//	System.out.println(result);
	}

	

	public static List<List<String>> groupAnagrams(String[] strs) {
	Map<String, List<String>> map = new HashMap<>();
	for(String s:strs) {
		char charArray[] = s.toCharArray();
		Arrays.sort(charArray);
		String key = new String(charArray);
		if(!map.containsKey(key) ) {
			map.put(key , new LinkedList<String>());
		}
		map.get(key).add(s);
		}
	return new LinkedList<>(map.values());
}
}

