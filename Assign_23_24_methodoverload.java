package dailyassignments;

public class Assign_23_24_methodoverload {

	static void add() {
		System.out.println("print static add");

	}

	static void sub(int a, int b) {
		System.out.println("print  static method sub");
	}

	static void div() {
		System.out.println("print static method div");
	}

	static void mult() {
		System.out.println("print static mult");
	}

	void test() {
		System.out.println("print non static method ");
	}

	void test2() {
		System.out.println("print non static ");
	}

	void test3() {
		System.out.println("print non static ");
	}

	public static void main(String[] args) {
		// program on method Overloading with 5 static method and 5 non static method
		add();
		sub(34, 23);
		div();
		mult();
		Assign_23_24_methodoverload obj1 = new Assign_23_24_methodoverload();
		obj1.test();
		obj1.test2();
		obj1.test3();

	}

}
