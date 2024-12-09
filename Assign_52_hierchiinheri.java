package dailyassignments;

public class Assign_52_hierchiinheri extends Mainparent {

	void multiply() {
		System.out.println("print from second child method");
	}

	public static void main(String[] args) {
		// hierarchical Level Inheritance
		System.out.println("print from second child");
		Assign_52_hierchiinheri obj1 = new Assign_52_hierchiinheri();
		obj1.add();// method calling from parent
		obj1.multiply();// method from same class
		first f1 = new first();// createnobject from second child class to acces its properties
		f1.sub();

	}

}

class first extends Mainparent {
	void sub() {
		System.out.println("print from first child ");
	}

}

class Mainparent {
	void add() {
		System.out.println("print method from parent ");
	}
}