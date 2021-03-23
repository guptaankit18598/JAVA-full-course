package userinput;
import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		
       Scanner sc = new Scanner(System.in);
       int T = sc.nextInt();
       for(int i=0;i<T;i++) {
    	   int N = sc.nextInt();
    	   for(int j=N;j!=0;j=j/10){
				int x = j%10;
					System.out.print(x);
		}
		System.out.println();
}
		
}
}
