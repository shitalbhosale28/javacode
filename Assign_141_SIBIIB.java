package dailyassignments;

public class Assign_141_SIBIIB {
	static {
		System.out.println("sib1");
	}
	static {
		System.out.println("sib2");
	}
	static {
		System.out.println("sib3");
	}
	{
		System.out.println("IIB1 ");
	}
	public static void main(String[] args) {
		// 1SIB, 2IIB, 1Main method, Create 2 object Check order of execution
		System.out.println("main method");
		Assign_141_SIBIIB OBJ=new Assign_141_SIBIIB();//
		Assign_141_SIBIIB OBJ1=new Assign_141_SIBIIB();//
	}

}
