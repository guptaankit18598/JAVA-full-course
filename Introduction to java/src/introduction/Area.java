package introduction;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Area {

	static boolean flag = true;
	static int B,H;

	static
	{
		Scanner sc = new Scanner(System.in);

	B = sc.nextInt();
	H = sc.nextInt();
	boolean flag = true;
	if(B<=0||H<=0)
	{
		System.out.println("java.lang.Exception: Breadth and height must be positive");
		flag = false;
		System.exit(0); 
		}

	}

public static void main(String[] args){
		if(flag){
			int area=B*H;
			System.out.print(area);
		}
		
	}//end of main

}//end of class

