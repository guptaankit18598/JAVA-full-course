package string;

import java.util.Scanner;

public class ReplaceWords {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- != 0) {
		  String s1 = sc.next();
		String replaceString=s1.replace("party", "pawri");//replaces all occurrences of "a" to "e"  
		System.out.println(replaceString);  
	}
	}
}

