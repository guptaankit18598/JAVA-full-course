package string;
import java.util.Scanner;
public class EvenOdd {

	public static void main(String[] args) {
		String str1;
		
    Scanner sc = new Scanner(System.in);
    
    int T = sc.nextInt();
    sc.nextLine();
    for(int i=0;i<T;i++) {
    	str1 = sc.nextLine();
    	 String rem1 = "";
		    String rem2 = "";
    for(int j=0;j<str1.length();j++) {
    	if(j%2 == 1) {
    	rem1 = rem1 + str1.charAt(j);
    } else {
    	rem2 = rem2 + str1.charAt(j);
    }
    	
    }
    System.out.println(rem2 + " " + rem1);

    }
	}
	
}
	


