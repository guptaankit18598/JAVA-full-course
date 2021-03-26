package array;

import java.util.Scanner;

public class MultiArray {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
         int t = sc.nextInt();
         while(t-- != 0) {
         int r = sc.nextInt();
         int c= sc.nextInt();

         int first[][] = new int[r+1][c+1];

         for (int i = 0; i < r; i++) {
             for (int j = 0; j < c; j++) {
                 first[i][j] = sc.nextInt();
             }
         }
         int q = sc.nextInt();
         for(int i = 0;i<q; i++) {
        	 char letter = sc.next().charAt(0);
        	 if (letter == 'a') {
        		 int x=sc.nextInt(),y=sc.nextInt();
		            first[x][y]=sc.nextInt();
		            System.out.println();
        	 }
        	 else {
        		 int x1=sc.nextInt(),y1=sc.nextInt(),x2=sc.nextInt(),y2=sc.nextInt(),sum=0;
	            for(int l=x1;l<=x2;l++)
	            for(int c1=y1;c1<=y2;c1++)
	            sum+=first[l][c1];
	            System.out.println(sum);
         }
	}

         }
	}
}


