package firstpackage;

public class Assign_gloable_oper {
	int a=25;
	  int b=40;

	public  void sub() {
		System.out.println(a+b);
	}
	public  void mult() {
		System.out.println(a*b);
	}
	public  void div() {
		System.out.println(a/b);
	}
	public  void mod() {
		System.out.println(a%b);
	}
	
	public static void main(String[] args) {
		Assign_gloable_oper obj1 =new Assign_gloable_oper();
		
		obj1.sub();
		obj1.mult();
		

	}

}
