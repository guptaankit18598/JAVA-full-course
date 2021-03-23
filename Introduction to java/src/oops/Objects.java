package oops;

class Cat {
	int eyes , legs;
	String breed , name;
	
	public void eat() {
		System.out.println("cat is eating");
	}
	public void walk() {
		System.out.println("cat is walking");
	}
	public void description() {
		System.out.println("blacky has"+" "+eyes+" eyes and "+legs+" legs. ");
		
	}
}
class Dog {
	String name, breed;
	int eyes , legs;
	boolean hasFur;
	
	public void eat() {
		System.out.println("Dog is eating");
	}
	
}

public class Objects {
	
	 

	public static void main(String[] args) {
		
		Cat blacky = new Cat();
		Dog husky = new Dog();
		blacky.eyes = 3;
		blacky.legs = 4;
		
		blacky.description();	
		
	}

}
