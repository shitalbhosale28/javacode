package dailyassignments;

public class Assign_81_arr {

	public static void main(String[] args) {
		// program to calculate average value of below array element [5,8,16,20,5]
	int [] age = new int [5];
	age[0]=45;
	age[1]=25;
	age[2]=32;
	age[3]=55;
	age[4]=35;
	int sum=0;
	 for(int i=0;i<=4;i++) {
		 sum=sum+age[i];
		 
	 }
	System.out.println(sum);
	double average =sum/age.length;
	System.out.println(average);

	}

}
