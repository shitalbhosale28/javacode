package dailyassignments;

public class Assign_10_Nestedifelse {

	public static void main(String[] args) {
		// Write a program on Nested if else block
		int a = 25;
		int b = 45;
		int c = 65;
		int d = 65;
		if (a < b) {
			if (b < c) {
				System.out.println("print a  is less than c");
			} else {
				System.out.println("print b is smallest");
			}
		}

		else {
			System.out.println("a is smaller ");
		}
	}

}
