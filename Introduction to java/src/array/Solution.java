package array;
import java.io.*;
import java.util.*;
import java.util.Scanner;
public class Solution {
    public static void main(String[] args) {
        int c=0;
        int d=0;
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        long[] a=new long [t];
                for(int i=0;i<t;i++)
        {
            a[i]=sc.nextLong();
        }
        long[] b=new long [t];
         for(int i=0;i<t;i++)
        {
            b[i]=sc.nextLong();
        }
                 for(int i=0;i<t;i++)
                 {
              if(a[i]>b[i])
              c+=1;
              else if(a[i]<b[i])
                  d+=1;
               else
            	   c+=0;
              d+=0;

                 }
                 System.out.println(c+" "+d);

    }
}