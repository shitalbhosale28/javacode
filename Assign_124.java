package dailyassignments;

import java.util.HashMap;
import java.util.Map;

public class Assign_124 {

	public static void main(String[] args) {
		// on Remove() method with Key and Both Key ,Value parameters in the Map Interface
	Map<Integer,String> m1=new HashMap<Integer,String>();
		
		m1.put(1, "anand");
		m1.put(2, "ABHA");
		m1.put(3, "Bharat");
		m1.put(4, "Bharri");
		m1.put(4, null);
		System.out.println(m1);
m1.remove("ABHA"); //REMOVE THE OBJECT WITH KEYS AND VALUE
System.out.println(m1);//IF I REMOVE VALUE STILL KEY IS PRESENT 
m1.remove(2); //here we have given keys to remove the object then particualr data will be remove 
System.out.println(m1); 
	}

}
