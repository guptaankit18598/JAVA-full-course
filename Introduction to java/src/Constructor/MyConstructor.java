package Constructor;

class Vehicle {
	int wheels;
	Vehicle(int wheels) {
		this.wheels=wheels;
	}
}

public class MyConstructor {
	
	MyConstructor() {
		System.out.println("Constructor created");
	}

	public static void main(String[] args) {
		Vehicle scooty = new Vehicle(2);
		Vehicle car2 = new Vehicle(4);
		System.out.println(scooty.wheels+" wheels");
	}

}
