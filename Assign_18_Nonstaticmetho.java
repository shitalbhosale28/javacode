package dailyassignments;

public class Assign_18_Nonstaticmetho {

	void add() {
		System.out.println("print non static add method");
	}

	void sub() {
		System.out.println("print non static sub method");
	}

	public static void main(String[] args) {
		// program to call a Non-Static Method
		Assign_18_Nonstaticmetho obj1 = new Assign_18_Nonstaticmetho();// created object to access non static method
		obj1.add();// calling non static method
		obj1.sub();// calling non static method

	}

}
