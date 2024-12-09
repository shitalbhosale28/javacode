package dailyassignments;

import java.util.Arrays;

public class Assign_82_1rrprob {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// program to calculate average value of below array element [5,8,16,20,5]
		int [] input= new int [5];
		input[0]=23;
		input[1]=25;
		input[2]=22;
		input[3]=35;
		input[4]=15;
		int []output =new int[input.length];
		for(int i=0,j=4;i<input.length;i++,j--)
		{
      output[j]=input[i];
      
	}
System.out.println(Arrays.toString(input));
System.out.println(Arrays.toString(output));
	}
}
