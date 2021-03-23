package whileloop;
import java.util.Scanner;

public class Kangaroo {
	public static void main(String[] args) {
	  Scanner sc = new Scanner(System.in);
	     int x1 = sc.nextInt();
	     int v1 = sc.nextInt();
	     int x2 = sc.nextInt();
	     int v2 = sc.nextInt();
	     int k1 = x1;
	     int k2 = x2;
	     if(x2>x1&&v2>v1){
	         System.out.print("NO");
	     }
	     else{
	         for(int i=0;i<10000;i++){
	             k1+=v1;
	             k2+=v2;
	             if(k1==k2){
	                 System.out.print("YES");
	                 System.exit(0);
	             }
	         }
	         System.out.print("NO");
	     }
	     }
	 }