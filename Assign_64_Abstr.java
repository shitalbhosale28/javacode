package dailyassignments;
//contains 1 abstract class, inside that abstrat class mention 2 abstract method, 1 concrete non static method, 1 concrete static method. override the non static methods
//(abstract menthods+non static concrete method) 
//and call all the methods in main method to execute.

public abstract class Assign_64_Abstr {

	abstract void add();
	abstract void subtract();
	void test() {
		System.out.println("non static parent method");
	}
	static void test1() {
		System.out.println("static method ");
	}
}
 class childabsttract extends Assign_64_Abstr {
	 public static void main(String[] args) {
		 childabsttract obj=new  childabsttract();
		 //obj.add();
		 obj.subtract();
		 obj.test();
		 
	}

	@Override
	void add() {
		System.out.println("child implementation add ");
		
	}

	@Override
	void subtract() {
		System.out.println("child implementation subtraction");
		
	}
	void test() {
		super.test();
		System.out.println("non static child  method");
	}
 }