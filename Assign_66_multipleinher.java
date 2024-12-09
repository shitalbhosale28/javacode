package dailyassignments;

public class Assign_66_multipleinher extends ab {

	public static void main(String[] args) {
		// create relationship between class and abstract class ,
		// abstract class and interface(Multi level inheritence)
		Assign_66_multipleinher obj = new Assign_66_multipleinher();
		obj.add();
		obj.div();
	}

	@Override
	public void add() {
		System.out.println("print in child class");

	}

	@Override
	void sub() {
		System.out.println("print subtraction in child");

	}

}

abstract class ab implements i133 {
	public abstract void add();

	abstract void sub();

	void div() {
		System.out.println("print from abstract concrete class");

	}

}

interface i133 {
	void add();
}