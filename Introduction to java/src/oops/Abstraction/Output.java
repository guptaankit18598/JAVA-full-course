package oops.Abstraction;

import java.util.Scanner;

abstract class Book{
       String title;
      public abstract void setTitle(String s);
  	 String getTitle(){
  		return title;
  	}
  }
class MyBook extends Book {
	@Override
	public void setTitle(String s) {
		title = s;
	  		

	}
	
}
public class Output {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String title=sc.nextLine();
		MyBook new_novel=new MyBook();
		new_novel.setTitle(title);
		System.out.println("The title is: "+new_novel.getTitle());
      	sc.close();
		
	}
}