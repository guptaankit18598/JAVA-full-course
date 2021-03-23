package userinput;

import java.util.Scanner;

public class LeadGame {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int maxOf= 0;
		int ans=0;
	     int T = sc.nextInt();
	     int[] S2 = new int[T];
	     int[] S1 = new int[T];
	     for(int i=0;i<T;i++) {
	    	 S1[i] = sc.nextInt();
	    	 S2[i] = sc.nextInt();
	    	 int temp = maxOf;
	    	 maxOf = Math.max(maxOf,Math.abs(S1[i]-S2[i])); 
	    	 if(maxOf != temp) {
	    		ans = i+1;
	    	 }
	    	 
	     }
	     if(S1[ans-1]-S2[ans-1] > 0) {
    		 System.out.println("1"+" "+ maxOf);
    	 } else {
	     System.out.println("2" +" "+maxOf);

	}

	}
}
