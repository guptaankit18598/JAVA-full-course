import java.io.*;

import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
	
    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";
		
        Scanner sc= new Scanner(System.in);

	              /* Declare second integer, double, and String variables. */
        Integer i1;
        Double d1;
        String s1;
        
        /* Read and save an integer, double, and String to your variables.*/
        i1= sc.nextInt();
        d1=sc.nextDouble();
        s1 = sc.next();
        while(sc.hasNext()){    
        s1+=sc.nextLine();
        }
        /* Print the sum of both integer variables on a new line. */
        System.out.println(i+i1);
        /* Print the sum of the double variables on a new line. */
        System.out.println(d+d1);
        /* Concatenate and print the String variables on a new line; 
            the 's' variable above should be printed first. */
        System.out.println(s+s1);
        
    }
}