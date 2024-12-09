package dailyassignments;

import java.util.Arrays;

public class Assign_071_72_Arrayex {

	public static void main(String[] args) {
		//create Array of size as 4 to store Int data type values
		int [] arr=new int[4];
		arr[0]=75;
		arr[1]=43;
		arr[2]=43;
		arr[3]=54;
		// create Array of size as 5 to store String data type values
		String []strarr=new String[5];
		strarr[0]="shital";
		strarr[1]="anshu";
		strarr[2]="shubhsl";
		strarr[3]="sapna";
		strarr[4]="sandy";
		 System.out.println(Arrays.toString(arr));
System.out.println(Arrays.toString(strarr));
for(int i=0;i<=4;i++)
{
	System.out.println(strarr[i]);
}
	}

}
