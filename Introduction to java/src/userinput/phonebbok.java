package userinput;
import java.util.Scanner;
public class phonebbok {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		
		for(int i = 0; i<T; i++) {
			String[] name = new String[T];
			name[i] = sc.nextLine();
			int[] number = new int[T];
			number[i] = sc.nextInt();	
		}
		 while(sc.hasNext()){
	            String s = sc.next();
	            // Write code here
	            for(int i = 0;i<T;i++) {
	            if(s.contentEquals(name[i])) {
	            	System.out.println(s + "=" + number[i]);
	            	
	            } else {
	            	System.out.println("Not found");
	            }
	            
	        }
         
	}

}
}
