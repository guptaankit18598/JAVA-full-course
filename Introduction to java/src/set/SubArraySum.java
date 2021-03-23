package set;
import java.util.*;
public class SubArraySum {

	public static void main(String[] args) {
		int[] a = {2,1,3,-4,2};
		// subArraySum = k
		int k = 6;
		// O(n square)
		boolean found = false;
//		for(int i = 0;i<a.length;i++) {
//			int sum = 0;
//			for(int j = i;i<a.length;j++) {
//				sum =sum+ a[j];
//				if(sum == 0) {
//					found = true;
//					break;
//				}
//			}
//			if(found) break;
//		}
		
		
		// O(n)
		Set<Integer> set= new HashSet<>();
		int sum = 0;
		for(int element:a) {
			set.add(sum);
		sum = sum+element;
		if(set.contains(sum-k)) {
			found = true;
			break;
		}
		}
		
		System.out.println("found" +" "+found);
		
	}

}
