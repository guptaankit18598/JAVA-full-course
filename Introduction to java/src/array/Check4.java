package array;
import java.util.Scanner;

public class Check4 {

	public static void main(String[] args) {
		   Scanner sc = new Scanner(System.in);
		   int n = sc.nextInt();
		   int[] arr = new int[n];
		   int a=0,b=0,c=0;
		   for(int i=0;i<n;i++) {
			   arr[i]=sc.nextInt();
			   if(arr[i]>0) {
				   a++;
			   } else if(arr[i]<0) {
					   b++;
				   } else {
					   c++;
				   }
				   
			   }
		   
		   double d = (double)a/n;
		   double e = (double)b/n;
		   double f = (double)c/n;
		   System.out.print(String.format("%.6g%n",d));
		   System.out.print(String.format("%.6g%n",e));
		   System.out.print(String.format("%.6g%n",f));
	}

}
