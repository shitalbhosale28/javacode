package dailyassignments;

public class Assign_03_staticmethod {

	public static void add() {
		int a = 20;
		int b = 25;
		int sum = a + b;
		System.out.println(sum);
	}

	public static void sub() {
		int a = 50;
		int b = 25;
		int sub = a - b;
		System.out.println(sub);
	}

	public static void multiply() {
		int a = 25;
		int b = 25;
		int mult = a * b;
		System.out.println(mult);
	}

	public static void division() {
		int a = 50;
		int b = 25;
		int div = a / b;
		System.out.println(div);

	}

	public static void mod() {
		double a = 50.3;
		double b = 25;
		double mod = a % b;
		System.out.println(mod);

	}

	public static void main(String[] args) {
		// print all static methods add,sub.multiplication
		add();
		sub();
		multiply();
		division();
		mod();
	}

}
