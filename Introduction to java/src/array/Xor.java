package array;

import java.util.Scanner;

public class Xor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 int xor_arr = 0;
        int t = sc.nextInt();
        while(t-- != 0) {
        int r = sc.nextInt();
        int c = sc.nextInt();
        int n = sc.nextInt();
        int[][] ans = new int[r][c];
        for(int i = 0;i<r;i++) {
        	for(int j =0;j<c;j++) {
			ans[i][j] = n+i+1+j+1;
			 xor_arr = xor_arr ^ ans[i][j];
        	}
        }
     		System.out.println(xor_arr);
        	}
        	}
        }

