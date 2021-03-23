package array;
import java.util.Scanner;

public class Mode {

	 static int mode(int a[],int n) {
		 int maxValue = 0, maxCount = 0, i, j;

	      for (i = 0; i < n; ++i) {
	         int count = 0;
	         for (j = 0; j < n; ++j) {
	            if (a[j] == a[i])
	            ++count;
	         }

	         if (count > maxCount) {
	            maxCount = count;
	            maxValue = a[i];
	         }
	      }
	      return maxValue;
	   }
	   public static void main(String args[]){
	     Scanner sc = new Scanner(System.in);
	     int T = sc.nextInt();
	     int[] a = new int[T];
	     for(int i = 0; i<T;i++) {
	    	 a[i] = sc.nextInt();
	     }
	      System.out.println("Mode = "+mode(a,T));
	   }

}
