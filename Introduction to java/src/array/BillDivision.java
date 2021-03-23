package array;
import java.util.Scanner;

public class BillDivision {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		int share1, share2;
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int[] bill = new int[n];
		for(int i=0; i<n; i++) {
			bill[i] = sc.nextInt();
			sum = sum + bill[i];
		}
		share1 = sum/2;
		int b = sc.nextInt();
		 share2 = (sum - bill[k])/2;
		 if(b>share2) {
			 System.out.println(b-share2);
		 } else {
			 System.out.println("Bon Appetit");
		 }
		 

	}

}
