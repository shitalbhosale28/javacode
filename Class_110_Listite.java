package dailyassignments;

import java.util.ArrayList;
import java.util.List;

public class Class_110_Listite {

	public static void main(String[] args) {
		// write a program on List Methods from add() to size() in the List Class
		List l1 = new ArrayList();
		l1.add("shital");
		l1.add(null);
		l1.add(true);
		l1.add(45);
		l1.add('d');
		System.out.println(l1);
		List l2 = new ArrayList();
		l2.add("test");
		l2.add(34);
		l2.add(56);
		l1.addAll(l2);
		System.out.println(l1);
		l1.remove(1);
		System.out.println(l1);
		boolean b1 = l1.isEmpty();
		System.out.println(b1);
		System.out.println(l1.contains("shital"));
		System.out.println(l1.size());
		l2.clear();
		System.out.println(l2);

	}

}
