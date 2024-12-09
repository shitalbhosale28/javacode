package dailyassignments;

public class Assign_130_131 {

	public static void main(String[] args) {
		// program on Insert() method using StringBuffer Class
		// program on replace() method using StringBuffer Class

		StringBuffer obj = new StringBuffer("automation  testing");

		obj.insert(11, "manual");
		System.out.println(obj); // automation manual testing
		obj.replace(0, 5, "bottom");
		System.out.println(obj);

	}

}
