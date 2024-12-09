package dailyassignments;

public class Assign_12_OrWithNot {
	static int a = 55;
	static int b = 60;

	public static void main(String[] args) {
		// Write a program using the OR with NOT operator

		int c = 55;
		int d = 45;
		Assign_12_OrWithNot obj1 = new Assign_12_OrWithNot();
		if (!(a > b || b < c)) {
			System.out.println("if statement excuted");
		} else
			System.out.println("else statement is excuted");

	}

}
