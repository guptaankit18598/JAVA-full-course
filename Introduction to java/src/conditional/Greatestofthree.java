package conditional;
import java.util.Scanner;

public class Greatestofthree {

	public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the value of a");
    int a=sc.nextInt();
    System.out.println("Enter the value of b");
    int b=sc.nextInt();
    System.out.println("Enter the value of c");
    int c=sc.nextInt();
    if(a>b)
    {
    	if(a>c)
    	{
    		System.out.println("a is greatest");
    	}
    	else
    	{
    		System.out.println("c is greatest");
    		
    	}
    }
    if(b>c)
    {
    	System.out.println("b is greatest");
    }
    else
    {
    	System.out.println("c is greatest");
    }

	}

}
