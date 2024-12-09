package dailyassignments;

public class Assign_58_methodover extends Parent2 {
	// a program for method overriding using super keyword

	void add(int a, int b) {
		super.add(40, 40);
		System.out.println(a + b);
	}

	public static void main(String[] args) {
		Assign_58_methodover obj1 = new Assign_58_methodover();
		obj1.add(40, 45);

	}

}

class Parent2 {
	void add(int a, int b) {
		System.out.println("print parent nonstatic method");
		System.out.println(a + b);
	}

	void sub() {
		System.out.println("print non static subtraction method");
	}

}