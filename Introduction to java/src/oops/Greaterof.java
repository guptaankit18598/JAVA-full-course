package oops;
import java.util.Scanner;

public class Greaterof {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	for(int i=0;i<2;i++) {	
      int c = sc.nextInt();
      int d = sc.nextInt();
      int result = MaxOf(c,d);
      System.out.println(result);
	}
	}
   static int MaxOf(int a , int b) {
	   if(a>b) {
		   return a;
	   }
		   else {
			   return b;
		   }
	   }
   }

