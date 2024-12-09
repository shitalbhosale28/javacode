package dailyassignments;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Assign_111_listeitr {

	public static void main(String[] args) {
		// program on List Interface for ListIterator() of forward Iteration and
		// Backward Iteration and Iterator() also.
		List l1 = new ArrayList();
		l1.add("automation");
		l1.add("testing");
		l1.add(true);
		l1.add(45);
		System.out.println(l1);
		Iterator obj = l1.iterator();
		ListIterator obj2 = l1.listIterator();
		while (obj.hasNext()) {
			System.out.println(obj.next());
		}
		while (obj2.hasNext()) {
			System.out.println(obj2.next()); // forward iteration
		}
		while (obj2.hasPrevious()) {
			System.out.println(obj2.previous()); // backward iteration
		}
	}

}
