package dailyassignments;

import java.util.Scanner;

public class Assign_39_AreaofTrian {

	public static void main(String[] args) {
		// Write a program to find out area of triangle using scanner class
		Scanner sc = new Scanner(System.in);
		System.out.println("enter lenth of traingle");
		int l = sc.nextInt();
		System.out.println("enter breadth of traingle");
		int b = sc.nextInt();
		System.out.println("enter width of traingle");
		int c=sc.nextInt();
		double area = (l * b * 1) / 2;
		System.out.println("area of triangle is  " + area);
		double circum=l+b+c;
		System.out.println("circumference of triangle is " + circum);
		
	}

}
