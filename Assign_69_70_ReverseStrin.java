package dailyassignments;

//CHECK REVERSE TRING AND PALLINDROME 

public class Assign_69_70_ReverseStrin {

	public static void main(String[] args) {
		// Reverse a String by using String Functions
		String s = "MADAM";
		String output = "";
		int l = s.length();
		System.out.println(l);
		System.out.println(s);
		System.out.print("reverse of string is  " + "  ");
		for (int i = s.length() - 1; i >= 0; i--) {
			System.out.print(s.charAt(i));
			output = output + s.charAt(i);
		}
		System.out.println(output);

		if (s.equals(output) == true) {
			System.out.println("string is pallindrome");
		} else
			System.out.println("string is not  pallindrome");
	}

}
