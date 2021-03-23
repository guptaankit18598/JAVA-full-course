package array;
import java.util.Scanner;

public class AppleOrange {

	public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int s = sc.nextInt();
    int t = sc.nextInt();
    int a = sc.nextInt();
    int b = sc.nextInt();
    int m = sc.nextInt();
    int n = sc.nextInt();
    int[] apples = new int[m];
    int[] oranges = new int[n];
    for(int i=0;i<m;i++) {
    	apples[i] = sc.nextInt();
    }
    for(int i=0;i<n;i++) {
    	oranges[i] = sc.nextInt();
    }
    int[] add1 = new int[m];
    int[] add2 = new int[n];
    for(int i=0;i<m;i++) {
    	add1[i] = a + apples[i];
    }
    for(int i=0;i<n;i++) {
    	add2[i] = b + oranges[i];
    }  
    int count1 = 0;
    int count2 = 0;
    for(int i=0;i<m;i++) {
    	if(add1[i]>=s && add1[i]<=t) {
    		count1++;
    	}
    }
    for(int i=0;i<n;i++) {
    	if(add2[i]>=s && add2[i]<=t) {
    		count2++;
    	}
    }
       System.out.println(count1);
       System.out.println(count2);

	}

}
