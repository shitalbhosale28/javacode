package dailyassignments;

import java.util.HashMap;
import java.util.Map;

public class Assign125_126_127 {

	public static void main(String[] args) {
		//  program on Get() method in the Map Interface.
		//on Contains() method both Key and Values in the Map Interface
		//a program on clear() and isempty() method in the Map Interface.
Map<Integer,String> m1=new HashMap<Integer,String>();
		
		m1.put(1, "anand");
		m1.put(2, "ABHA");
		m1.put(3, "Bharat");
		m1.put(4, "Bharri");
		System.out.println(m1);
	 System.out.println(m1.get(1)); //get method to get particualr value related to particular key 
	 System.out.println(m1.containsKey(2));
	 System.out.println(m1.containsValue("ABHA"));
	 System.out.println(m1.containsValue("abha"));// java is case sensitive 
	 m1.clear();
	 System.out.println(m1);
		
		
		
		
		
		
	}

}
