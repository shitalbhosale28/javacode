package dailyassignments;

public class Assign_57_thisuse {
//Program on This Calling Statement
	Assign_57_thisuse() {
		this(23, 34);
		System.out.println("print default constructor");
	}

	Assign_57_thisuse(int a, int b) {
		System.out.println(a + b);
	}

	public static void main(String[] args) {
		// Program on This Calling Statement
		Assign_57_thisuse obj1 = new Assign_57_thisuse();

	}

}
