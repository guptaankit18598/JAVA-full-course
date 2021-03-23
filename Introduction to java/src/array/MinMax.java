package array;
import java.util.Scanner;

public class MinMax {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int[] arr = new int[5];
		int[] sum = new int[5];
		for(int i=0;i<5;i++) {
			arr[i] = sc.nextInt();
		}
		 int leftSum[] = new int[5]; 
	        int rightSum[] = new int[5]; 
	        
	  
	        int i = 0, j = 0; 
	    
	        leftSum[0] = 0; 
	
	        rightSum[4] = 0; 
	  
	        for (i = 1; i < 5; i++) 
	            leftSum[i] = arr[i - 1] + leftSum[i - 1]; 
	  
	        for (j = 3; j >= 0; j--) 
	            rightSum[j] = arr[j + 1] + rightSum[j + 1]; 
	
	        for (i = 0; i < 5; i++) 
	            sum[i] = leftSum[i] + rightSum[i]; 
	        
		
	        int max = getMax(sum);
			  int min = getMin(sum);
			  System.out.println(min+" "+max);
	}
		
   
	
	 public static int getMax(int[] inputArray){ 
		    int maxValue = inputArray[0]; 
		    for(int i=1;i < inputArray.length;i++){ 
		      if(inputArray[i] > maxValue){ 
		         maxValue = inputArray[i]; 
		      } 
		    } 
		    return maxValue; 
		  }
	 public static int getMin(int[] inputArray){ 
		    int minValue = inputArray[0]; 
		    for(int i=1;i<inputArray.length;i++){ 
		      if(inputArray[i] < minValue){ 
		        minValue = inputArray[i]; 
		      } 
		    } 
		    return minValue; 
		  } 
		}
