package string;
import java.util.Scanner;

public class Anagram3 {

	 static boolean isAnagram(String a, String b) {
	        // Complete the function
		 a = a.toLowerCase();
		 b = b.toLowerCase();
		 
	          boolean isanagram=false;
	         boolean visited[]=new boolean[b.length()];
	      if(a.length()==b.length()) {
	          
	      for(int i=0;i<a.length();i++) {
	        char c=a.charAt(i);
	         isanagram=false;
	         for(int j=0;j<b.length();j++) {
	              if(b.charAt(j)==(c) && !visited[j]) {
	                  visited[j]=true; 
	                  isanagram=true;
	                  break;
	    }
	         } if(!isanagram) break;
	      } 
	    }
	      if(isanagram) 
	          return true;
	           else 
	          return false;
	    }

	    public static void main(String[] args) {
	    
	        Scanner scan = new Scanner(System.in);
	        String a = scan.next();
	        String b = scan.next();
	        scan.close();
	        boolean ret = isAnagram(a, b);
	        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
	    }
	}