package dailyassignments;

public class Assign_35_Mathfuncti {
	void add(int a, int b) {
		System.out.println(a + b);
	}

	void subtract(int a, int b) {
		System.out.println(a - b);
	}

	void division(int a, int b) {
		System.out.println(a / b);
	}

	public static void main(String[] args) {
		// Write a program to perform addition, multiplication, subtraction,
		// and division using a custom Math class
		Assign_35_Mathfuncti obj1 = new Assign_35_Mathfuncti();
		obj1.add(45, 053);
		obj1.subtract(400, 0122);
		obj1.division(100, 25);

		System.out.println(Math.addExact(45, 053));
		System.out.println(Math.subtractExact(400, 0122));
		System.out.println(Math.multiplyExact(343, 045));
		System.out.println(Math.divideExact(100, 025));

	}

}
