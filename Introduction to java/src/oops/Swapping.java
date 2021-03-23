package oops;

public class Swapping {

	public static void main(String[] args) {
    int c = 23;
    int d = 45;
    swap(c,d);
    System.out.println(c+" "+d);
    
	}


 static void swap(int a, int b) {
	 int temp = a;
	 a=b;
	 b=temp;
	 
 }
}
