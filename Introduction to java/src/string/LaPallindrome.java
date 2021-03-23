package string;

import java.util.Scanner;

public class LaPallindrome {

	 static final int MAX_CHAR = 26; 
     
	    // function to check both halves 
	    // for equality 
	    static boolean checkCorrectOrNot(String s) 
	    { 
	        // Counter array inisialized with 0 
	        int[] count = new int[MAX_CHAR]; 
	       
	        // Length of the string 
	        int n = s.length(); 
	        if (n == 1) 
	            return true; 
	       
	        // traverse till the middle element 
	        // is reached 
	        for (int i = 0,j = n - 1; i < j; i++, j--) 
	        { 
	            // First half 
	            count[s.charAt(i) - 'a']++; 
	       
	            // Second half 
	            count[s.charAt(j) - 'a']--; 
	        } 
	       
	        // Checking if values are different 
	        // set flag to 1 
	        for (int i = 0; i < MAX_CHAR; i++) 
	            if (count[i] != 0) 
	                return false; 
	       
	        return true; 
	    } 
	    public static void main(String args[]) 
	    { 
	        // String to be checked 
	        Scanner sc = new Scanner(System.in);
	        int T = sc.nextInt();
	    	sc.nextLine();

	        for(int i=0; i <T+1; i++) {
	        	 String s = sc.nextLine();
	        if (checkCorrectOrNot(s)) 
	            System.out.println("Yes"); 
	        else
	           System.out.println("No"); 
	    } 
	    
	} 
}
