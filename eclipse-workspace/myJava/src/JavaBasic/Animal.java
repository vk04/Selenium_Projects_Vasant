package JavaBasic;

public class Animal {

	public static void main(String[] args) {
		dog d = new dog();
		smallDog sd = new smallDog();
		sd.display(0);
		sd.display(0, 0);
		sd.run();

	}

}

class dog {

	boolean display(int a) {
		System.out.println("Display dog");
		return false;
	}

	void run() {
		System.out.println("method run");
	}
}

class smallDog extends dog {

	// method Overloading

	int display(int b, int a) {
		System.out.println("Display small dog");
		return 0;
	}

	// method Overriding
	void run() {
		System.out.println("method ovrridden run");
	}

}
