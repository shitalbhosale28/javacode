package dailyassignments;

public class Assign_49_Singlinherit_nonstatic extends parent1 {

	void add() {
		System.out.println("print from child class nonstatic method");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assign_49_Singlinherit_nonstatic obj1 = new Assign_49_Singlinherit_nonstatic();
		obj1.add();
		obj1.subtraction();

	}
}

class parent1 {

	void add() {
		System.out.println("print non static method from parent class");
	}

	static void subtraction() {
		System.out.println("print static from parent class");
	}
}