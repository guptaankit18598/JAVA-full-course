package userinput;

import java.util.Arrays;
import java.util.Scanner;

public class Candies {
	
	public static long candy(int a[] , int n) {
		int[] c = new int[n];
		Arrays.fill(c, 1);
		for(int i=1;i<n;i++) {
			if(a[i] > a[i-1]) {
				c[i] = c[i-1] +1;
			}
		}
		for(int i = n-2;i>=0;i--) {
			if(a[i]>a[i+1]) {
				c[i] = Math.max(c[i+1]+1,c[i] );
			}
		}
		long sum=0;
		for(int i=0;i<n;i++) {
			sum=sum+ (long)c[i];
		}
		return sum;
	} 

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		long sum = candy(arr,n);
               System.out.println(sum);
	}

}
