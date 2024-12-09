package dailyassignments;

public class Assign_22_ConstructOverload {

	Assign_22_ConstructOverload() { // default constructor
		System.out.println("default constructor");
	}

	Assign_22_ConstructOverload(int a, char b) { // parameterized constructor
		System.out.println("para constructor with integer and character constructor");
	}

	Assign_22_ConstructOverload(int c, boolean d) { // param eterized constructor
		System.out.println("parameterized constructor with int and boolean");
	}

	Assign_22_ConstructOverload(String a, int b) { // parameetrized constructor
		System.out.println("parameterized with string and integer ");
	}

	public static void main(String[] args) {
		// Write a program on constructor Overloading
		Assign_22_ConstructOverload obj = new Assign_22_ConstructOverload();
		Assign_22_ConstructOverload obj1 = new Assign_22_ConstructOverload(45, 'r');
		Assign_22_ConstructOverload obj33 = new Assign_22_ConstructOverload(45, true);
		Assign_22_ConstructOverload obj332 = new Assign_22_ConstructOverload("test", 46);

	}

}
