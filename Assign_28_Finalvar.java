package dailyassignments;

public class Assign_28_Finalvar {
	final int a = 76;// making non static variable as final
	final int b = 45; // making non static variable as final
	int d = 56;

	public static void main(String[] args) {
		// Write a program using Final variable
		Assign_28_Finalvar obj1 = new Assign_28_Finalvar();
		System.out.println(obj1.a);
		// obj1.a=577;we can not update non static variable value as it is a Final
		obj1.d = 67;
		System.out.println(obj1.d);
		obj1.add();
	}

	void add() {
		System.out.println(d);
		int a = 78;
		int b = 76;
		a = 66;// updating local value
		System.out.println(a);//
	}

}
