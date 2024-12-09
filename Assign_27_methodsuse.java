package dailyassignments;

public class Assign_27_methodsuse {

	void add(int a, int b) {
		System.out.println("the addtion is " + (a + b));
	}

	void sub(int a, int b) {
		System.out.println("the subtraction is  " + (a - b));
	}

	void mult(int a, int b) {
		System.out.println("the multiplication  is  " + (a * b));
	}

	void div(int a, int b) {
		System.out.println("the division  is  " + (a / b));
	}

	void modulus(int a, int b) {
		System.out.println("the modulus is  " + (a % b));
	}

	public static void main(String[] args) {
		// Write a program to create a class with 5 methods addition,
		// subtraction, multiplication, division, modulus. Create 2 global variable a &
		// b and
		// perform the operation without involving 3rd variable.
		Assign_27_methodsuse obj1 = new Assign_27_methodsuse();
		obj1.add(45, 56);
		obj1.sub(100, 45);
		obj1.mult(34, 45);
		obj1.div(45, 56);
		obj1.modulus(100, 45);

	}

}
