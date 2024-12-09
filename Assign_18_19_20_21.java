package dailyassignments;
//program to call a Non-Static Method

//program on the Constructor method
//Non-Static Method Parametrized method

public class Assign_18_19_20_21 {
	static void add1() { // static method
		System.out.println("add static method");
	}

	void add() { // non static non para mathod
		System.out.println("hi non static method");
	}

	void sub(int a, int b) {// non static parameterized method
		System.out.println(a - b);
	}

	Assign_18_19_20_21() { // default or non para constructor
		System.out.println("print constructor");
	}

	public static void main(String[] args) {

		Assign_18_19_20_21 obj1 = new Assign_18_19_20_21();
		obj1.add(); // calling non static parameterized method
		obj1.sub(90, 45); // calling non static para method
		add1();

	}

}
