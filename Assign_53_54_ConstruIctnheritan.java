package dailyassignments;

public class Assign_53_54_ConstruIctnheritan extends test1 {
	Assign_53_54_ConstruIctnheritan() {
		super();// calling super() method explicitly
		System.out.println("print the constructor of main class");
	}

	public static void main(String[] args) {
		// constructor inheritance using the super calling statement with Implicit
		// Invocation
		Assign_53_54_ConstruIctnheritan obj1 = new Assign_53_54_ConstruIctnheritan();

	}

}

class test1 {
	test1() {
		System.out.println("print the constructor from parent class");
	}

}
