package string;
import java.io.*;
import java.util.*;

public class Result {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        int i1 = sc.nextInt();
        sc.nextLine();
        String s2 = sc.next();
        int i2 = sc.nextInt(); 
        sc.nextLine();
        String s3 = sc.next();
        int i3 = sc.nextInt();
        
        
        System.out.println("================================");
        System.out.format("%-14s %03d %n%-14s %03d %n%-14s %03d %n" , s1,i1,s2,i2,s3,i3);
        System.out.println("================================");
    }
}