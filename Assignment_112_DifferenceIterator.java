package dailyassignments;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Vector;

public class Assignment_112_DifferenceIterator {

	public static void main(String[] args) {
		// Write a difference between 3 types of cursor1.Enumeration   2.Iterator 3.ListIterator
          List l1 = new ArrayList();
          Vector v= new Vector(); // Imported vector and created object of vector to access its properties
          
          l1.add("this");
          l1.add("is");
          l1.add("Automation");
          l1.add("batch");
          l1.add(47);
         // Collections.sort(l1);
            Iterator i1 = l1.iterator();
            //System.out.println(l1);
            while(i1.hasNext()) {
            	System.out.println(i1.next());
            }
            
      
          //  i1.remove();        Iterator() has REMOVE METHODS
            	 ListIterator l2=l1.listIterator(); //ListIterator can do forward (has next method )and backward (has previous method) iteration
            	 
            	 while(l2.hasNext()) {
            		System.out.println( l2.next());
            	 }
            	 while(l2.hasPrevious()) {
            		System.out.println( l2.previous());
            	 }
            	// l2.remove();   ListIterator() has remove method
            	 l2.set(l2); //ListIterator() has Set method to replace any value 
            	 l2.add(l2); //ListIterator has add method 
            }
            
	}


