package userinput;
import java.util.Scanner;
import java.text.DecimalFormat;
import java.math.RoundingMode;

public class ATM {

	public static void main(String[] args) {
		      Scanner sc=new Scanner(System.in);
		      int x =sc.nextInt();
		      double y=sc.nextDouble();
		      if(x%5==0 && (x+0.5)<=y)
		      {
		          y=y-(x+0.5);
                System.out.println(y);
		      }
		      else
		          System.out.println(y);
	      
	}
}
