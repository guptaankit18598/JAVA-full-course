package string;
import java.util.Scanner;

public class Pallindrome {
	  public static void main(String[] args) {
		  String str, rev = "";
	      Scanner sc = new Scanner(System.in);
	 	      str = sc.nextLine();
	 
	      int length = str.length();
	 
	      for ( int i = length - 1; i >= 0; i-- )
	         rev = rev + str.charAt(i);
	      System.out.println(rev);
	 
	      if (str.equals(rev))
	         System.out.println("Yes");
	      else
	         System.out.println("No");
	 
	   }
	}