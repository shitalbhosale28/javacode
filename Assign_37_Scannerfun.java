package dailyassignments;

import java.util.Scanner;

public class Assign_37_Scannerfun {

	public static void main(String[] args) {
		// Write a program to do Addition,Subtraction,Multiplication,
		// and Division and Modulus using Scanner class with 2 variables
		Scanner sc = new Scanner(System.in);
		System.out.println("enter value of a");
		int a = sc.nextInt();
		System.out.println("Enter value of b");
		int b = sc.nextInt();
		System.out.println(" the addition of and b is " + (a + b));
		System.out.println(" the subtraction of and b is " + (a - b));
		System.out.println(" the multiplication  of and b is " + (a * b));
		System.out.println(" the division of and b is " + (a / b));

	}

}
