package firstpackage;

public class Assign_83_String {

	public static void main(String[] args) {
		// String is consist of exact 3 letters
		String s="shital";
		
		System.out.println(s.replace('i', 'a'));
	
		System.out.println(s.replaceAll("hi", "ma"));
		// boolean b1=s.matches("...");
		boolean b1=s.matches("......");
		 System.out.println(b1);
		 //chack given string starts with a
		 
     String s2="abbbcdef";
     boolean b2= s2.matches("a(.*)");
     System.out.println(b2);
     //check given string ends with e
     String s3="name";
     boolean b3=s3.matches("(.*)e");
     System.out.println(b3);
     //check if the given string have letter "u";
     String s4="ashu";
     boolean b4=s4.matches("(.*)u(.*)");
     System.out.println(b4);
     String s5="Test Automation";
      System.out.println(s5.repeat(4));
       int a=s5.lastIndexOf('e');
       System.out.println(a);
       
       String m="Manish Kumar Tiwari";
       System.out.println(m.replaceAll("Manish Kumar Tiwari","MKT"));
     m.replaceAll("Manish Kumar Tiwari","MKT");
     System.out.println(m.replaceAll("Manish Kumar Tiwari", "m"));
     System.out.println(m.replaceAll("Manish Kumar Tiwari", "k"));
     System.out.println(m.replaceAll("Manish Kumar Tiwari", "t"));
       
	}

}