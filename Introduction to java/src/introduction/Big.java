package introduction;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.util.Scanner;

public class Big {

	 public static void main(String []args){
	        //Input
		 Scanner sc= new Scanner(System.in);
	        int n=sc.nextInt();
	        String []s=new String[n+2];
	        for(int i=0;i<n;i++){
	            s[i]=sc.next();
	        }
	      	sc.close();

	        //Write your code here
	         Arrays.sort(s,0,n,new Comparator<String>(){
	          public int compare(String a1, String a2) {
	              BigDecimal bigDec1 = new BigDecimal((String)a1);
	              BigDecimal bigDec2 = new BigDecimal((String)a2);
	              return bigDec2.compareTo(bigDec1);
	            }
	            });
	        

	        //Output
	        for(int i=0;i<n;i++)
	        {
	            System.out.println(s[i]);
	        }
	    }
}