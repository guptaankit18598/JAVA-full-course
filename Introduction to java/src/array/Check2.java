package array;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;
import java.util.Scanner;

class Check2 {

   public static void main(String[] args) 
    { 
	   int d1 = 0, d2 = 0; 
       
       for (int i = 0; i < n; i++) 
       { 
           for (int j = 0; j < n; j++) 
           { 
               // finding sum of primary diagonal 
               if (i == j) 
                   d1 += arr[i][j]; 
      
               // finding sum of secondary diagonal 
               if (i == n - j - 1) 
                   d2 += arr[i][j]; 
           } 
       } 
      
       // Absolute difference of the sums 
       // across the diagonals 
       return Math.abs(d1 - d2); 
   } 
     
   /* Driver program to test above function */
   public static void main(String[] args)  
   { 
       int n = 3; 
          
       int arr[][] = 
       { 
           {11, 2, 4}, 
           {4 , 5, 6}, 
           {10, 8, -12} 
       }; 
      
       System.out.print(difference(arr, n)); 
        
   } 
 } 