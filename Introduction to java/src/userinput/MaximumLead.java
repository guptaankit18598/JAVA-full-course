package userinput;
import java.util.Scanner;

public class MaximumLead {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int index;
		int T = sc.nextInt();
		int[] p1= new int[T];
		int[] p2= new int[T];
		int[] r= new int[T];
		for(int i = 0; i<T; i++) {
			p1[i] = sc.nextInt();
			p2[i] = sc.nextInt();
		}
		for(int i = 0; i<T; i++) {
			r[i] = Math.abs(p1[i] - p2[i]);
		}
		int max = 0;
		for(int i = 1; i<T; i++) {
			max = r[i]>r[max] ? i : max;
			}
			int result = p1[max]-p2[max];
			if(result>0) {
				System.out.print("1");
			} else {
				System.out.print("2");
			}
			
		
	System.out.println(" "+r[max]);

	}
}


