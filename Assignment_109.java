package dailyassignments;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Assignment_109 {
	// write a program on While Loop.

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Collection obj = new ArrayList();// upcasting
		obj.add("Tesla");
		obj.add(4.33);
		obj.add(34);
		obj.add('3');
		obj.add("Toyota");
		System.out.println(obj);
		obj.iterator();
		Iterator itr = obj.iterator();
		while (itr.hasNext() == true) // iteration() using while loop
		{
			System.out.println(itr.next());
		}

	}

}
