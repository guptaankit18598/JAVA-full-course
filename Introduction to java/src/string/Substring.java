package string;
import java.util.Scanner;

public class Substring {

	public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     String S = sc.nextLine();
     int start = sc.nextInt();
     int end = sc.nextInt();
     System.out.println(S.substring(start,end));

	}

}
