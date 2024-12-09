package dailyassignments;

import java.util.HashMap;
import java.util.Map;

public class Assign_117_120_121_122 {

	public static void main(String[] args) {
		// Write a program using the put() method with Object, Object parameters in the
		// Map Interface.
		Map<Object, Object> obj = new HashMap<Object, Object>();
		Map<Object, Object> obj11 = new HashMap<Object, Object>();
		obj.put("tes766t", 123);
		obj.put("test1", 's');
		obj.put("test", "testing");// adding object in the colection
		obj.put(true, "testing");
		System.out.println(obj);
		obj11.put("abhay", 40000);
		obj11.put("navy", 51000.99);
		obj11.put("jay", 's');
		System.out.println(obj11);
		obj.putAll(obj11); // adding collection
		System.out.println(obj);
		obj11.putIfAbsent("newadded", 123);
		System.out.println(obj11); // putif absent will add if already not present
		boolean b1 = obj.equals(obj11);
		System.out.println(b1); // checking whether obj1 and obj11 is equals
		boolean b2 = obj.containsKey("test");
		System.out.println(b2);

	}

}
