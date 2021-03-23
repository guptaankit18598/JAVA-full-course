package oops.ExceptionHandling;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		
				try {
					Scanner sc = new Scanner(System.in);
					int a = sc.nextInt();
					int b = sc.nextInt();
		     int c = a/b;
		System.out.println(c);

	} catch(Exception e) { 
		System.out.println(e.toString());
	}
	}

}
