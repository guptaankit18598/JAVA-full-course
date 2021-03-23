package array;
import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Arrays;

/* Name of the class has to be "Main" only if the class is public. */
class Indexing
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int t,n,i,k;
		long m;
		Scanner sc=new Scanner(System.in);
		t=sc.nextInt();
		while(t>0){
		    n=sc.nextInt();
		    long[] arr=new long[n];
		    for(i=0;i<n;i++){
		        arr[i]=sc.nextInt();
		    }
		    k=sc.nextInt();
		    //System.out.println(k);
		    m=arr[k-1];
		    //System.out.println("old");
		   // System.out.println(m);
		    
		    

		    Arrays.sort(arr);
		    for(i=0;i<n;i++){
		        if(arr[i]==m){
		            System.out.println(i+1);
		            //System.out.println("new");
		            //System.out.println(arr[i]);
		        }
		    }
		    t--;
		}
		
	}
}
