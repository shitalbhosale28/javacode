package dailyassignments;

import java.util.Scanner;

public class Assign_41_Squr {

	public static void main(String[] args) {
		// Write a program to find out area of rectangle and circumferernce using
		// scanner class
		Scanner sc = new Scanner(System.in);
		System.out.println("enter lenth of rectangle");
		int r = sc.nextInt();
		System.out.println("enter breadth of rectangle");
		int b = sc.nextInt();

		double area = r * b;
		System.out.println("area of rectangle is  " + area);
		double circumfer = 2 * (r + b);
		System.out.println("circumference of rectangle " + circumfer);

	}

}
