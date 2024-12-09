package dailyassignments;

public class Assign_67_MultiplInheri implements iter1, iter2 {

	public static void main(String[] args) {
		// multiple level inheritence using interface
		Assign_67_MultiplInheri obj = new Assign_67_MultiplInheri();
		obj.add();
		obj.div();
		obj.sub();
		obj.mult();
	}

	@Override
	public void mult() {
		System.out.println("mult fron interface 2");

	}

	@Override
	public void div() {
		System.out.println("div from interface 2");

	}

	@Override
	public void add() {
		System.out.println("add from interface 1");

	}

	@Override
	public void sub() {
		System.out.println("sub from interface 1");

	}

}

interface iter1 {
	void add();

	void sub();
}

interface iter2 {
	void mult();

	void div();
}