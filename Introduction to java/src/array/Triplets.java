package array;

import java.util.Scanner;

public class Triplets {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a1=0;
		int b1=0;
		int[] a = new int[3];
		int[] b = new int[3];
		for(int i=0; i<3;i++) {
			a[i] = sc.nextInt();
		}
		for(int i=0; i<3;i++) {
			b[i] = sc.nextInt();
		}
		for(int i=0; i<3;i++) {
           if(a[i]>b[i]) {
        	   
			a1++;
           } else {
        	   b1++;
           }
	}
		System.out.println(a1+" "+b1);
	}

}
