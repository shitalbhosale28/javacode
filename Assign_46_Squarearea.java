package dailyassignments;

import java.util.Scanner;

public class Assign_46_Squarearea {

	public static void main(String[] args) {
		// area and CIRCUMFERENCE OF SQUARE
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the lenth of square");
		int r = sc.nextInt();
		int area = r * r;
		System.out.println(area);
		int circumfer = 4 * r;
		System.out.println(circumfer);

	}

}
