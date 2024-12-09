package dailyassignments;

import java.util.HashMap;
import java.util.Map;

public class Assign_118_119 {

	public static void main(String[] args) {
		// to print name and gender using the put() method in the Map Interface.
		// program to print name and Salary using the put() method in the Map Interface.
		Map<String, Character> obj = new HashMap<String, Character>();
		Map<String, Double> obj11 = new HashMap<String, Double>();
		obj.put("Shital", 'F');
		obj.put("Sneha", 'F');
		obj.put("Swapnil", 'M');
		obj.put("Amol", 'M');
		System.out.println(obj);
		obj11.put("Abha", 45000.00);
		obj11.put("Abhay", 50000.50);
		obj11.put("navy", 25000.100);
		System.out.println(obj11);

	}

}
