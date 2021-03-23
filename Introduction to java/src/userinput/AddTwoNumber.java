package userinput;
import java.util.Scanner;

public class AddTwoNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int i = 0;i<T;i++) {
			int n1 = sc.nextInt();
			int n2 = sc.nextInt();
			int result = addNo(n1,n2);
			System.out.println(result);
		}
		

	}
	
	public static int addNo(int a, int b) {
		int c = a+b;
		return c;
	}

}
