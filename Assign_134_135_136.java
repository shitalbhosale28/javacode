package dailyassignments;

public class Assign_134_135_136 {

	public static void main(String[] args) {
		// program on capacity() method using StringBuffer Class
		//program on charAt() method using StringBuffer Class
		//a program on subString() method using StringBuffer Class
		StringBuffer s1=new StringBuffer("Shital Amol Bhosale"); 
		StringBuffer s2=new StringBuffer("Shital");
		System.out.println(s1.capacity());//16+19
		System.out.println(s2.capacity());//capacity is by default capacity 16+6 =22
		System.out.println(s2.charAt(0)); //same like string method will tell the charatcter at index 
		System.out.println(s2.substring(1));//substring with single parameter .It will print the string from index value 1=hital
		System.out.println(s2.substring(1, 3));// from index 1 to (3-1) i.e 2 index i.e hi

	}

}
