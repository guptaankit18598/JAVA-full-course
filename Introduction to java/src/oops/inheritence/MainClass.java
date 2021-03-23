package oops.inheritence;

public class MainClass {

	public static void main(String[] args) {
		Teacher t = new Teacher();
		Singer s = new Singer();
		s.name = "Mr.Harry";
		t.name = "Mr.Harry";
		t.eat();
		s.sing();

	}

}
