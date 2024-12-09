package dailyassignments;

public class Assign_65_testcla implements i1 {

	public static void main(String[] args) {
		// program to create relationship between class and interface
		Assign_65_testcla obj = new Assign_65_testcla();
		obj.add();

	}

	@Override
	public void add() {
		System.out.println("printed in child class");

	}

	@Override
	public void sub() {
		// TODO Auto-generated method stub
		
	}

}

interface i1 {
	void add();
	void sub();
}