package userinput;
import java.util.Scanner;
import java.io.*;
import java.util.*;
import java.math.*;

public class PrimeNo {
	 public static void main(String[] args) {
	      Scanner in = new Scanner(System.in);
	      int i = 1;
	      while(in.hasNext()) {
	      
	      BigInteger n = in.nextBigInteger();
	      
	      System.out.println(n.isProbablePrime(1) ? "prime" :"not prime");
	      i++;
	    }
	 }
	}