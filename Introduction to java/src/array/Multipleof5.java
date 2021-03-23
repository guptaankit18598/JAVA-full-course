package array;
import java.util.Scanner;

public class Multipleof5 {

	public static void main(String[] args) {
    Scanner sc=new Scanner (System.in);
    int n=sc.nextInt();
    long[] a=new long[n];
    long[] b=new long[n];
    
    for(int i=0;i<n;i++)
    {
    	a[i]=sc.nextLong();
    	b[i] = a[i];
    	a[i] = (a[i]/5)*5+5;
    	if((a[i]-b[i])>=3)
    	{
    		System.out.println(b[i]);
    	}
    	else
    		System.out.println(a[i]);
    }
    
    
	}

}
