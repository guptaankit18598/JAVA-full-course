package array;

import java.util.Scanner;

public class Polygon {
	 static boolean ifPossible(int a[], int n) 
	    { 
	        int sum = 0, max = 0; 
	        for (int i = 0; i < n; i++) { 
	            sum += a[i]; 
	            max = Math.max(a[i], max); 
	        }  
	        if ((sum - max) > max) {
	            return true; 
	        }
	        return false; 
	    } 
	  
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		for(int i =0;i<T;i++) {
			int n = sc.nextInt();
			int[] arr = new int[n];
			for(int j=0;j<n;j++) {
			    arr[j] = sc.nextInt();
		      }
			if (ifPossible(arr, n)) {
	            System.out.println("Yes");
			    System.out.println();
			}
	        else {
	            System.out.println("No"); 
			    System.out.println();
	    } 
		}
		
	}

}
