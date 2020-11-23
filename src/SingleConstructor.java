class Constructor {
	Constructor() {
		System.out.println("This is super class constructor");
	}
}

public class SingleConstructor extends Constructor {
	SingleConstructor() {

		System.out.println("This is sub class constructor");
	}

	public static void main(String[] args) {
		Constructor sc = new SingleConstructor();
	}
}
