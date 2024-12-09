package dailyassignments;

import java.util.Arrays;

public class Assign_80_Arrayprob {
	static int  count=0;
	static int  count1=0;
	static int  count2=0;
	

	public static void main(String[] args) {
		// write a program to find 
		//: Number of Alphabet :2: Number of Numeric:	3: Number of Space:4:Number of Special character:in Given string : 
		
		String s= "KV no 2&*";
		char [] c= s.toCharArray();
		System.out.println(Arrays.toString(c));
		
		for(int i=0;i<s.length() ; i++)
		{
		 boolean b1=Character.isAlphabetic(c[i]);
		 boolean b2=Character.isDigit(c[i]);
		 boolean b3=Character.isWhitespace(c[i]);
		// System.out.println(b1);
		 
		 if (b1==true) {
			 count++;
		 }
		 if (b2==true) {
			 count1++;
		 }
		 if (b3==true) {
			 count2++;
		 }
		 
		}
		System.out.println("count of alphabets " + count);
		System.out.println("count of digits " +count1);
		System.out.println("count of space " + count2);
		 int special=c.length-(count+count1+count2);
		 System.out.println( "special characyer are "+ special);
		
		
		
		
	}
		
	
		
		

}
