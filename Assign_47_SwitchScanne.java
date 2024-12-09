package dailyassignments;

import java.util.Scanner;

public class Assign_47_SwitchScanne {

	public static void main(String[] args) {
		// a program to launch different browsers using Scanner class in switch Concept
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the  option 1 : mozilla 2: firefox 3:Safari 4:edge");
		int s = sc.nextInt();
		switch (s) {
		case 1:
			System.out.println("mozilla");
			break;
		case 2:
			System.out.println("firefox");
			break;
		case 3:
			System.out.println("safari");
			break;
		default:
			System.out.println("wrong input");
		}

	}

}
