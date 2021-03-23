package userinput;
import java.util.Scanner;

public class TrailingZero {

	public static void main(String[] args) {
		
			// your code goes here
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for(int j=0;j<T;j++) {
			int n=sc.nextInt();
			int count = 0;
		 for (int i = 5; n / i >= 1; i *= 5) 
	            count += n / i; 
			System.out.println(count);
		}
	}
	}
