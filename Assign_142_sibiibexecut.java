package dailyassignments;

public class Assign_142_sibiibexecut {
	Assign_142_sibiibexecut(){
		System.out.println("constructor1");
	}
	Assign_142_sibiibexecut(int a ){
		System.out.println("constructor1");
	}
	
	static {
		System.out.println("sib1");
	}
	{
		System.out.println("iib1");
	}
	{
		System.out.println("iib2");
	}
	{
		System.out.println("iib3");
	}

	public static void main(String[] args) {
		// Write a program where u have 1SIB ,3IIB ,2Constractor,	1Main method
     System.out.println("main method");
     Assign_142_sibiibexecut obj=new Assign_142_sibiibexecut();
     Assign_142_sibiibexecut obj1=new Assign_142_sibiibexecut(14);
     

	}

}
