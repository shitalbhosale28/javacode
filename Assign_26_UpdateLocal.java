package dailyassignments;

public class Assign_26_UpdateLocal {
	static int a;
	static int b;
	int c = 80;

	void add() {
		System.out.println(c);
		
	}

	public static void main(String[] args) {
		// a program to update value of local and static global variable and non static
		// global variable.
		int a = 20;
		int b = 45;
		System.out.println(a);
		Assign_26_UpdateLocal obj = new Assign_26_UpdateLocal();
		obj.c = 67;
		System.out.println(obj.c);
		obj.c = 70;
		System.out.println(obj.c);
		obj.add();
		a = 99000;
		b = 8888;
		System.out.println(a + b);

	}

}
