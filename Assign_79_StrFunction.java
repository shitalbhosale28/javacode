package dailyassignments;

import java.util.Arrays;

public class Assign_79_StrFunction {

	public static void main(String[] args) {
		// String Functions
		String s="TestAutomation";
		char [] d=s.toCharArray();
		System.out.println(Arrays.toString(d));
		
		char c=s.charAt(0);
		String dr= s.toUpperCase();
		String th= s.toLowerCase();
		  CharSequence chh=s.subSequence(1, 4);
	String test=	 s.trim();
	System.out.println(c);
	System.out.println(dr);
	System.out.println(th);
	System.out.println(chh);
	System.out.println(test);
	//char[] a=s.toCharArray();
	System.out.println(s.toCharArray());
	
		 
		 
	}

}
