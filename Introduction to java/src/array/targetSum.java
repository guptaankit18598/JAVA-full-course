package array;
import java.util.*;

public class targetSum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int target = sc.nextInt();
		int n = sc.nextInt();
		int[] a = new int[n];
		for(int i = 0;i<n;i++) {
			a[i] = sc.nextInt();
		}
	        for(int i = 0;i<n-1;i++) {
	        	for(int j = i+1; j<=n-i-1;j++) {
	        		if(a[i] +a[j] == target)  {
	        			System.out.println(i+"," +j);
	        			break;
	        		} 
	        		}
	        }
	        
	    }
	        
	}
