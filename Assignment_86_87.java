package dailyassignments;

public class Assignment_86_87 {

	public static void main(String[] args) {
		// program to replace all the lower case letter with nothing in the string "Kv
		// No 2"
		// write a program to replace all the numeric with nothing in the string "Kv No
		// 2"
		String s = "Kv No 2";
		System.out.println(s.replaceAll("[0-9]", " "));

		System.out.println(s.replaceAll("[a-z]", " "));
	}

}
