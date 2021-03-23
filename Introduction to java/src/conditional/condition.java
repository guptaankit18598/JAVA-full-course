package conditional;
import java.util.Scanner;

public class condition {

	public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n = sc.nextInt();
    if(n>=10)
    {
    	System.out.println("Accepted");
    }
    else {
    	System.out.println("Not Accepted");
    }
	}

}
