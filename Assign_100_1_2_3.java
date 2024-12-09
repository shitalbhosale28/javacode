package dailyassignments;

import java.util.ArrayList;
import java.util.Collection;

public class Assign_100_1_2_3 {
	// add method in the collection class with hetrogeneous Values
	// write a program on add All method in the Collection class
	// Program on Clear method in the collection class
	// write a program on isempty method in the Collection class.

	public static void main(String[] args) {
		//
		Collection obj = new ArrayList();
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
		obj.clear(); // clear the collection
		System.out.println(obj);
		boolean b1 = obj.isEmpty();
		System.out.println(b1);

	}

}
