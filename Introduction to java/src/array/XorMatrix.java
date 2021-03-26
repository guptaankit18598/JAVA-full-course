package array;

import java.util.Scanner;

public class XorMatrix {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 
       int t = sc.nextInt();
       while(t-- != 0) {
    	   int A = 0;
    	   int ans = 0;
       int r = sc.nextInt();
       int c = sc.nextInt();
       int k = sc.nextInt();
       for(int i = 0;i<r;i++) {
       	for(int j =0;j<c;j++) {
			ans = k+i+j+2;
			 A= A ^ans;
       	}
       }
    		System.out.println(A);
       	}
       	}
       }


