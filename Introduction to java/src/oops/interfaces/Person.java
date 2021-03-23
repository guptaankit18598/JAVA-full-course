package oops.interfaces;

public class Person implements Youtuber, Student  {

	public static void main(String[] args) {
		Person obj  = new Person();
		obj.study();
		obj.makeVideo();

	}
	public void study() {
		System.out.println("Person is studying");
	}
	public void makeVideo() {
		System.out.println("Person is making videos");
	}

}
































