package userinput;
import java.util.Scanner;

public class simpleinterest {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int prin = sc.nextInt();
		float rate = sc.nextFloat();
		int time = sc.nextInt();
		float simpleinterest = (prin*rate*time)/100;
		System.out.println("Simple Interest is="+simpleinterest);

	}

}
