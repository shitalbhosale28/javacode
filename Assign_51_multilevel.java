package dailyassignments;

public class Assign_51_multilevel extends parentfirst {

	void selfmethod() {
		System.out.println("printing child method");
	}

	public static void main(String[] args) {

		Assign_51_multilevel obj1 = new Assign_51_multilevel();
		obj1.add();
		obj1.test();
		obj1.selfmethod();
		// multilevel inherit

	}

}

class parentfirst extends parentsecond {

	void add() {
		System.out.println("printing from parents first non static method");
	}

}

class parentsecond {
	void test() {
		System.out.println("printing from parents second non static method");
	}
}