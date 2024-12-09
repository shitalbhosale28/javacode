package dailyassignments;

public class Assun_56_multilevconstructo extends p3 {
	
	Assun_56_multilevconstructo(){
		super('c',34);
		System.out.println("default constructor");
	}
	

	public static void main(String[] args) {
		// constructor inheritance- Multi level using a parameterized super calling statement with explicit invocation
		Assun_56_multilevconstructo obj1=new Assun_56_multilevconstructo();
		p2 obj2=new p2(3,4);
	}

}
  class p2 extends p3 {
	  p2(int a,int b){
		  super('d',344);
		 System.out.println(" print from constructor class p2 "); 
	  }
	  
	  
  }
   class p3{
	   
	   p3(char c,int d){
		   System.out.println("print from constructor  p3");
	   }
	   
	   
   }