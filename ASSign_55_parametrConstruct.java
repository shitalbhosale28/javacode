package dailyassignments;

public class ASSign_55_parametrConstruct extends p1{

	ASSign_55_parametrConstruct() {
		super(34,34);
		System.out.println("print constructor from the child ");
	}

	public static void main(String[] args) {
		// constructor inheritance- single level using a parameterized super calling
		// statement with explicit invocation
		ASSign_55_parametrConstruct obj1=new ASSign_55_parametrConstruct();
		
	}

}

class p1 {

	p1(int a, int b) {
		int c = a + b;
		System.out.println("print from the paren  " + c);

	}

}