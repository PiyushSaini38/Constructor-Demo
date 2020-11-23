
class Vehicle {
	Vehicle() {
		System.out.println("This is vehicle constructor");
	}
}

class Bus extends Vehicle {
	Bus() {
		System.out.println("This is bus class constructor");
	}

	void show() {
		System.out.println("Inside Bus Class");
	}
}

class Metro extends Vehicle {
	Metro() {
		System.out.println("This is metro class constructor");
	}

	void show() {
		System.out.println("Inside Metro Class");
	}
}

public class ConstructorMultiple {

	public static void main(String[] args) {
		Vehicle b = new Bus();
		Vehicle m = new Metro();
	}

}
