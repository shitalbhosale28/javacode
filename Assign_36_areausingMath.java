package dailyassignments;

public class Assign_36_areausingMath {

	void area_of_circle(int r) {
		double area = Math.PI * r * r; // using math pi function
		System.out.println(area);
	}

	public static void main(String[] args) {
		// Write a program to calculate the area of a circle
		// using a Math class
		Assign_36_areausingMath obj1 = new Assign_36_areausingMath();
		obj1.area_of_circle(45);

	}

}
