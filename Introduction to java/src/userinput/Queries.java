package userinput;
import java.util.Scanner;

public class Queries {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int T = sc.nextInt();
		for(int i = 0;i < T;i++) {
		   long n = sc.nextLong();
		   if(n >= -128 &&  n <= 127) {
			   System.out.println(n + "can be fitted in:");
			   System.out.println("* byte " );
		   }
		   else	 if(n >= -32768 && n <= 32767) {
				   System.out.println(n + "can be fitted in:");
				   System.out.println("* short\n * int\n * long " );
			   
			}
		   else if(n >= -2147483648 && n <= 2147483647) {
			   System.out.println(n + "can be fitted in:");
			   System.out.println("* int\n * long " );
		   }
		   else if(n >= - && n <= 92233720) {
			   
		   }
		}

	}

}
