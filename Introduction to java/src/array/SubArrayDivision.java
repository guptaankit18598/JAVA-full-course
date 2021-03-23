package array;
import java.util.Scanner;

public class SubArrayDivision {

	public static void main(String[] args) {
		int count = 0;
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] s = new int[n];
		for(int i = 0; i<n; i++) {
			s[i] = sc.nextInt();
		}
		int d = sc.nextInt();
		int m = sc.nextInt();
		for(int i=0; i<n+1-m; i++) {
			int sum = 0;
			for(int j=i; j<m+i; j++) {
			sum = sum+ s[j];
			}
			if(sum == d) {
				count++;
		}
		}
		System.out.println(count);

	}

}
