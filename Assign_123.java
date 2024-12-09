package dailyassignments;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Assign_123 {

	public static void main(String[] args) {
		// Write a program on Iteration methods in the Map Interface using For Each Loop
		// Concept. 1.keySet().2.values(). 3.entrySet().

		Map<Integer, String> m1 = new HashMap<Integer, String>();

		m1.put(1, "anand");
		m1.put(2, "ABHA");
		m1.put(3, "Bharat");
		m1.put(4, "Bharri");
		System.out.println(m1);
		Set<Integer> m2 = m1.keySet(); // to get the keys from the map we can this method ne
		System.out.println(m2);
		// if we want to have one by one key we have to use for each loop
		for (Integer m3 : m1.keySet()) {
			System.out.println(m3);
		}
		// we want to print values use for each loop
		for (String m4 : m1.values()) {
			System.out.println(m4);
		}
		// entryset () to print the keys and value together
		Set<Entry<Integer, String>> m5 = m1.entrySet();
		System.out.println(m5);
		Iterator m6 = m5.iterator(); // to get keys and value one by one we used Set iterator
		while (m6.hasNext()) {
			System.out.println(m6.next());
		}

	}

}
