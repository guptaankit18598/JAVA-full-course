package introduction;
import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     double mealCost=sc.nextDouble();
    	 int tipPercent=sc.nextInt();
     int taxPercent=sc.nextInt();
     double c=(double)(((double)tipPercent*mealCost)/100);
     double d=(double)(((double)taxPercent*mealCost)/100);
      double totalCost= (double)mealCost+(double)c+(double)d;
     System.out.println(Math.round(totalCost));
    	 }

}
