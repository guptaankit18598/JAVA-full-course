package array;
import java.util.Scanner;
public class BreakingRecords {

	public static void main(String[] args) {
		int hr = 0 , lr = 0;
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] t = new int[n];
		
		for(int i=0;i<n;i++) {
			t[i] = sc.nextInt();
		}
		
			
			int max = t[0];
			for(int j=1;j<n;j++) {
				if(max < t[j]) {
					hr++;
					max=t[j];
		}

			}
			System.out.println(hr);
			int min = t[0];
			for(int j=1;j<n;j++) {
				if(min > t[j]) {
					lr++;
					min=t[j];
				}
			}
			System.out.println(lr);
	}
}


