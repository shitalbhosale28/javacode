package dailyassignments;
//Write a program to check which method access specifiers are 
//accessable inside same class
 

public class Assign_60_AccessSpecifierClass {
	
	 public void add() {
		System.out.println("print add");
	}

	 private void sub() {
		System.out.println("print sub");
	}

	 protected void mul() {
		System.out.println("print mul");
	}

	  void div() {
		System.out.println("print div");
	}

	public static void main(String[] args) {
		Assign_60_AccessSpecifierClass OBJ1 =new  Assign_60_AccessSpecifierClass();
		OBJ1.add();// public can be used in same class
		OBJ1.sub();// private method can be used
		OBJ1.mul();//protected can be used in same class
		OBJ1.div();//default can be used in same class 
		

	}

}
