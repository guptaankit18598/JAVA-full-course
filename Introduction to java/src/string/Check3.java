package string;
import java.util.Scanner;

public class Check3 {

	public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      String A = sc.nextLine();
      String B = sc.nextLine();
      int sum = A.length() + B.length();
      System.out.println(sum);
      int result = A.compareTo(B);
      if(result <= 0) {
    	  
    	  System.out.println("Yes");
      } else {
    	  System.out.println("No");
      }
      String output1 = A.substring(0,1).toUpperCase() + A.substring(1);
      String output2 = B.substring(0,1).toUpperCase() + B.substring(1);
      System.out.println(output1+" "+output2);

    	  
	}

}
