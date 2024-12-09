package dailyassignments;

import java.util.Scanner;

public class Assign_40_AreaCircl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter radius of circle");
		int r = sc.nextInt();
		double p = Math.PI;
		double area = p * r * r;
		System.out.println("area of circle is  " + area);
		double circumfe=2*p*r;
		System.out.println("circumference of circle is " + circumfe);

	}

}
