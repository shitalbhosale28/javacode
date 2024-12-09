package dailyassignments;

public class Assign_09_ifelseif {

	public static void main(String[] args) {
		// Write a program on if else if block
		// if first if is true will not execute other else if block
		int a = 25;
		int b = 45;
		int c = 35;
		if (a < 20) {
			System.out.println("print first if statement");
		} else if (b < 20) {
			System.out.println("print first elseif condition");
		} else if (c > 25) {
			System.out.println("print second else if statement");
		} else {
			System.out.println("print last else part");
		}

	}

}
