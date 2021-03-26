package map;

import java.util.*;

public class LongestCosecutiveSequence {

	public static void main(String[] args) {
		int[] arr = {2,12,9,16,10,5,3,20,25,11,1,8,6};
		System.out.println(lcs(arr));

	}

	private static ArrayList<Integer> lcs(int[] arr) {
		HashMap<Integer, Boolean> map = new HashMap<>();
		for(int i =0;i<arr.length;i++) {
			int am1 = arr[i] -1;
			if(map.containsKey(am1)) {
				map.put(arr[i], false);
			}
			else {
				map.put(arr[i], true);
			}
			int ap1 = arr[i]+1;
			if(map.containsKey(ap1)) {
				map.put(ap1, false);
			}
		}
		ArrayList<Integer> keys = new ArrayList<>(map.keySet());
		int maxlength = Integer.MIN_VALUE;
		int maxstartingno = 0;
		for(int key:keys)
			if(map.get(key)== true) {
				int startingno = key;
				int count  = 0;
				while(map.containsKey(startingno+count)) {
					count++;
				}
				if(count > maxlength) {
					maxlength = count;
					maxstartingno = startingno;
				}
			}
		
		
	
	ArrayList<Integer> mr = new ArrayList<>();
	for(int i = 0; i<maxlength;i++) {
		mr.add(maxstartingno+i);
	}
	
	return mr;

//	private static int lonCons(int[] arr) {
//		HashMap<Integer, Integer> map = new HashMap<>();
//		 Arrays.sort(arr);
//		 map.put(arr[0], 1);
//		 for(int i =1;i<arr.length;i++) {
//			   int ch = arr[i];
//			    if(map.containsKey(ch)) {
//				  int val = map.get(ch);
//				  map.put(ch,val);
//			   } else if(ch == arr[i-1]+1) {
//					   int val = map.get(ch-i);
//					   map.put(ch-i, val+1);
//				   }
//					   
//			   
//			   else {
//				   map.put(ch, 1);
//			   }
//		   }
//		 Set<Integer> keyset = map.keySet();
//			int maxfreq = Integer.MIN_VALUE;
//			int maxInt = ' ';
//			for(int key:keyset) {
//				if(map.get(key) > maxfreq) {
//					maxfreq = map.get(key);
//					maxInt = key;
//				}
//			}
//			return maxInt;
	//}
   
}
}

