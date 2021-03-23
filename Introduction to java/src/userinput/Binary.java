package userinput;
import java.util.Scanner;

public class Binary {

	public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
   int n = sc.nextInt();
   int count = 0;
   while (n!=0) {
      n = (n & (n << 1));
      count++;
      System.out.println(count);
   }	}
	
	}
