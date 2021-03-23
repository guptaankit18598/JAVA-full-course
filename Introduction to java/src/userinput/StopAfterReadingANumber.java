package userinput;
import java.util.Scanner;

public class StopAfterReadingANumber {

	public static void main(String[] args) {
     Scanner sc= new Scanner(System.in) ;
     while(sc.hasNext()) {
    	 int n= sc.nextInt();
    	 if(n!=42) {
    		 System.out.println(n);
    	 } else {
    		 break;
    	 }
     }
	}

}
