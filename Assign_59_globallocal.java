package dailyassignments;

public class Assign_59_globallocal {
	int a = 50;// non static global variable
	int b = 50; // non static global variable

	void add(int a, int b) {

		int c = a + b;// local variable
		System.out.println(c);
		this.a = a;
		this.b = b;
		System.out.println(c);

	}

	public static void main(String[] args) {
		// Whrite a program where the non static global variable datatype used are same
		// as local variable.
		// Use non static method to use the local variable in method. Use this key word
		// to update the global variable value same as local variable.
		Assign_59_globallocal obj1 = new Assign_59_globallocal();
		obj1.add(40, 40);

	}

}
