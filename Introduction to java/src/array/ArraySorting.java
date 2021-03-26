package array;

import java.util.Scanner;

public class ArraySorting {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int n = sc.nextInt();
       

        int first[][] = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                first[i][j] = sc.nextInt();
            }
        }
        int i=0,j=0,c=0;
        for (; i < n; j++) {
            for (; j < n; i++) {
            	if(first[i][j] > first[i+1][j]) {
            		first[i][j] = first[j][i];
            		c++;
            }
        }
            }
        for (; i < n; j++) {
            for (; j < n; i++) {
            	first[i][j] = first[j][i];
            }
        }
        for (; i < n; j++) {
            for (; j < n; i++) {
            	System.out.print(first[i][j]+" ");
            }
            System.out.println();
        }
            }
            }
        



