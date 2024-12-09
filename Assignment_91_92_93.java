package dailyassignments;

public class Assignment_91_92_93 {

	public static void main(String[] args) {
		// Check if the given string have the letter 'u' in it.
		// Write a program to repeat the string for 5 times.
		String s = "Shital Bhosale ";
		System.out.println(s.matches("(.*)u(.*)"));
		System.out.println(s.repeat(5));
		System.out.println(s.lastIndexOf('i'));

	}

}
