package dailyassignments;

public class Assignment_88_89_90 {

	public static void main(String[] args) {
		// Check if the given strig consist of exact 3 letters
		// check if the given string starts with 'a'
		// Check if the given string ends with 'e' in String "axe"
		String s = "axe";
		System.out.println(s.matches("..."));
		System.out.println(s.matches("a(.*)"));
		System.out.println(s.matches("(.*)e"));

	}

}
