package array;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class WeightIncrease {

	public static void main(String[] args) {
		try
		{
		InputStreamReader R = new InputStreamReader(System.in);
		BufferedReader B = new BufferedReader(R);
		int T = Integer.parseInt(B.readLine());
		while(T-->0)
		{
		String[] S = B.readLine().split(" ");
		int A[] = new int[S.length];
		for(int i=0;i<S.length;i++)
		A[i] = Integer.parseInt(S[i]);
		int r = A[1]-A[0];
		if(r>=(A[2]*A[4]) && r<=(A[3]*A[4]))
		System.out.println("1");
		else
		System.out.println("0");
		}
		}
		catch(Exception e)
		{
		}
		}
		}

}
