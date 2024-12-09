package dailyassignments;

public class Assign_32_31_33Switchprog {

	public static void main(String[] args) {

		for (int i = 1; i <= 8; i++) {
			if (i == 3) {
				continue;// continue keyword is use to skip the particular iteration
			}
			System.out.println(i);
		}

		switch (1) {
		case 1:
			System.out.println("print mozilla browser");
			break;
		case 2:
			System.out.println("print ie explorer");
			break;

		case 3:
			System.out.println("print safari");
			break;

		case 4:
			System.out.println("print edge browser");
			break;
		default:
			System.out.println("options are incorrect");

		}
	}

}
