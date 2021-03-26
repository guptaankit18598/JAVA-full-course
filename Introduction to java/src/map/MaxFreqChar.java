package map;

import java.util.*;

public class MaxFreqChar {

	public static void main(String[] args) {
		String str = "aaabbbbbffffrrrrggghhhhhhh";
         System.out.println(maxFreqChar(str));
	}

	private static char maxFreqChar(String str) {
		HashMap<Character,Integer> map = new HashMap<>();
		   for(int i =0;i<str.length();i++) {
			   char ch = str.charAt(i);
			   if(map.containsKey(ch)) {
				  int val = map.get(ch);
				  map.put(ch,val+1);
			   } else {
				   map.put(ch, 1);
			   }
		   }
		Set<Character> keyset = map.keySet();
		int maxfreq = Integer.MIN_VALUE;
		char maxChar = ' ';
		for(char key:keyset) {
			if(map.get(key) > maxfreq) {
				maxfreq = map.get(key);
				maxChar = key;
			}
		}
		return maxChar;
	}

}
