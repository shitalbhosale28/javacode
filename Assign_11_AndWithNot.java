package dailyassignments;

public class Assign_11_AndWithNot {

	public static void main(String[] args) {
		// a program using the AND with NOT operator
		int a = 50;
		int b = 45;
		int c = 55;

		if (!(a < b && b < c)) {
			System.out.println("a is less than c");

		} else {
			System.out.println("print else statement");
		}
	}

}
