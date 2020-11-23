
class GrandFather {
	GrandFather() {
		System.out.println("This is Grandfather constructor");
	}
}

class Father extends GrandFather {
	Father() {
		System.out.println("This is Father constructor");
	}
}

class Child extends Father {
	Child() {
		System.out.println("This is Child constructor");
	}
}

public class ConstructorMultilevel {

	public static void main(String[] args) {
		Child f = new Child();

	}

}
