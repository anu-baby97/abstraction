package abstractionPackage1;

public abstract class AbstractClassExample {

	public void setUp() {
		System.out.println("This is non-abstract method 1");
	}

	public void tearDown() {
		System.out.println("This is non-abstract method 2");
	}

	public abstract void process();
}
