package dailyassignments;

public class ASSIGN_68_Strinfunction {

	public static void main(String[] args) {
		// Write a program with different string function mentioned below




String s="  Shital Amol  Bhosale   ";
String s2="  Shital Amol  Bhosale   ";
 int a=s.length();
 System.out.println(a);
 String l=s.toLowerCase();
 String up=s.toUpperCase();
 System.out.println(l + " " + up);
String t= s.trim(); //trim the starting and ending space 
System.out.println(t);
 char charat=s.charAt(8);
 System.out.println(charat);
  int index= s.indexOf("S");
  System.out.println(index);
 String test= s.substring(3,7);
 System.out.println(test);
boolean b= s.equals("test");
System.out.println(b);
 boolean bs=s.contains("Shital");
 System.out.println(bs);
 boolean ts=s.equalsIgnoreCase(s2);
 System.out.println(ts);
  
 
 
 
	}

}
