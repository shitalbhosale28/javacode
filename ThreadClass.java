package dailyassignments;

public class ThreadClass {

	public static void main(String[] args) throws InterruptedException {
		// Write a program on Thread Class Method

		for (int i = 0; i <= 3; i++) {
			System.out.println(i);
			Thread.sleep(2000);// using thread class we can inactive fir 2 sec i.e 2000ms
		}
		Object String;
		for (int j = 0; j < 3; j++) {
			String s = "shital";
			System.out.println(s);
		}

	}

}
