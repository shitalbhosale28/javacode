package dailyassignments;

import java.util.ArrayList;
import java.util.Collection;

public class Assignment_104_5_6_7_8 {
	//program on Contains method in the Collection class.//write a program on Contains All method in the Collection class.//write a program on Remove method in the Collection class
	//write a program on Remove All method in the Collection class.//write a program on Size method in the Collection class.

	public static void main(String[] args) {
		
		Collection obj = new ArrayList();//upcasting
		obj.add("Tesla");
		obj.add(4.33);
		obj.add(34);
		obj.add('3');
		obj.add("Toyota");
		System.out.println(obj);
		Collection obj1 = new ArrayList();
		obj1.add("dog");
		obj1.add("cat");
		obj1.add("sheep");
		obj1.add("chicken");
		System.out.println(obj1);
		obj.addAll(obj1);
		System.out.println(obj);
		System.out.println(obj.contains("Tesla"));  //contain method
	 System.out.println(obj.containsAll(obj1));
	 obj.remove(34);
	 System.out.println(obj);
	 obj.removeAll(obj1);
	 System.out.println(obj);
	 System.out.println(obj1.size());
	 
		
	}

}
