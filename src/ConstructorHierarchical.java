class Animal {
	Animal() {
		System.out.println("This is animal class constructor");
	}
}

class Dog extends Animal {
	Dog() {
		System.out.println("This is dog class constructor");
	}
}

class Cat extends Animal {
	Cat() {
		System.out.println("This is cat class constructor");
	}
}

public class ConstructorHierarchical {
	public static void main(String[] args) {
		Animal c = new Cat();
	}

}
