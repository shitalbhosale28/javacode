package dailyassignments;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Assign_138_139 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("enter index of array roll number");
			int[] rollno = new int[sc.nextInt()];
		} catch (NegativeArraySizeException n) {
			System.out.println("enter positive value of array size ");
			Scanner sc = new Scanner(System.in);
			System.out.println("enter index of array roll number");
			int[] rollno = new int[sc.nextInt()];
			for (int i = 0; i <= rollno.length - 1; i++) {
				rollno[i] = sc.nextInt();
			}

			System.out.println(Arrays.toString(rollno));

		} catch (InputMismatchException i) {
			System.out.println("enter int value only");
			Scanner sc = new Scanner(System.in);
			System.out.println("enter index of array roll number");
			int[] rollno = new int[sc.nextInt()];
			for (int i1 = 0; i1 < rollno.length - 1; i1++) {
				rollno[i1] = sc.nextInt();
				System.out.println(Arrays.toString(rollno));
			}
			}
finally {
	System.out.println("finally will definitly print");
}
	}
}
