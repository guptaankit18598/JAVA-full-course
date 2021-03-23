package array;
import java.util.Scanner;

public class SumOfDigits {

	public static void main(String[] args) {
		int count = 0;
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] ar = new int[n];
		for(int i=0;i<n;i++) {
			ar[i] = sc.nextInt();
			count = count + ar[i];
		}
		System.out.println(count);

	}

}
