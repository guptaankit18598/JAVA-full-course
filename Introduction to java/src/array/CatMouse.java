package array;
import java.util.Scanner;

public class CatMouse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] x = new int[n];
		int[] y = new int[n];
		int[] z = new int[n];
		for(int i=0;i<n;i++) {
			x[i] = sc.nextInt();
			y[i] = sc.nextInt();
			z[i] = sc.nextInt();
		}
		for(int i=0;i<n;i++) {
		if((Math.abs(x[i]-z[i])) < (Math.abs(y[i]-z[i]))) {
			System.out.println("Cat A");
			
		} else if((Math.abs(x[i]-z[i])) > (Math.abs(y[i]-z[i]))) {
			System.out.println("Cat B");
		} else {
			System.out.println("Mouse C");
		}
		}

	}

}
