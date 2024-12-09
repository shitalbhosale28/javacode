package dailyassignments;

public class Assignm_94_95 {

	public static void main(String[] args) {
		// Write a program where Input is"Manish Kumar Tiwari"  and Output"MKT"
		//Write a program where Input is"Manish Kumar tiwari" Output"
		//M
		//K
		//T
		String s="Manish Kumar Tiwari";
		String mkt=s.replaceAll("[a-z]", " ").replace(" ", "");
	 for (int i=0;i<3;i++)
	 {
		System.out.println(mkt.charAt(i));
	 }
		System.out.println(s.replaceAll("[a-z]", " ").replace(" ", ""));
	
      

	}

}
