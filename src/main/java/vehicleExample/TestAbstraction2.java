package vehicleExample;

//Example of an abstract class that has abstract and non-abstract methods also with constructor
abstract class Bike {
	Bike() {
		System.out.println("bike is created");
	}

	abstract void run();

	void changeGear() {
		System.out.println("gear changed");
	}
}

//Creating a Child class which inherits Abstract class  
class Honda extends Bike {
	void run() {
		System.out.println("running safely..");
	}
}

public class TestAbstraction2 {
	public static void main(String args[]) {
		Bike obj = new Honda();
		
		obj.changeGear();
		obj.run();
	}
}
