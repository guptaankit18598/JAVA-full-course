package array;
import java.util.Scanner;

public class MinDiff {

	public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     int T = sc.nextInt();
     int N = sc.nextInt();
     int[] S = new int[N];
     for(int i=0;i<N;i++) {
    	 S[i] = sc.nextInt();
     }
 	int min=S[1]-S[0];
     for(int i=0;i<N-1;i++) {
         for(int j=i+1;j<N;j++) {

        	int diff = Math.abs(S[j] - S[i]);
             if (diff < min)
                 min = diff;
     }
     }
     System.out.println(min);
	}
	
	

}
