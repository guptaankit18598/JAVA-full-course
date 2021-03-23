package array;
import java.util.Scanner;
public class Candles {

	public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0;i < n; i++) {
        	arr[i] = sc.nextInt();
        }
        int result = getMax(arr);
        int count = 0;
        for(int i = 0;i < n; i++) {
        	if(arr[i] == result)
        		count++;
        }
        System.out.println(count);

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
	}


