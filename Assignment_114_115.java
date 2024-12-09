package dailyassignments;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Assignment_114_115 {

	public static void main(String[] args) {
		//  program on sort method in collection class for integer values 
		ArrayList <Integer>obj =new ArrayList<Integer>();
		ArrayList <String>obj1 =new ArrayList<String>();
		obj.add(45);
		obj.add(35);
		obj.add(105);
		obj.add(95);
		System.out.println("output is" + obj);;
		Collections.sort(obj);
		System.out.println("sorted int  output is " + obj);
		obj1.add("Shital");
		obj1.add("Anshu");
		obj1.add("Amol");
		System.out.println(" String output is" + obj1);;
		Collections.sort(obj1);
		System.out.println("sorted String output is " + obj1);
		
		
		

	}

}
