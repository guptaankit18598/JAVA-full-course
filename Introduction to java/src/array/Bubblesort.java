package array;

public class Bubblesort {

	public static void main(String[] args) {
     int a[]={2,1,-3,4,5};
     int n=a.length;
     for(int i=0;i<n-1;i++) {
    	 boolean sorted = true;
    	 for(int j=0;j<n-1;j++) {
    		 if(a[j+1]<a[j]) {
    			 int temp=a[j+1];
    			 a[j+1]=a[j];
    			 a[j]=temp;
    			 sorted = false;
    		 }
    	 }
    	 if(sorted==true) break;
     }
    		 for(int item:a) {
    		 System.out.print(item+" ");
    		 }
     }
	}


