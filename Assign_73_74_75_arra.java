package dailyassignments;

import java.util.Arrays;
import java.util.Scanner;

public class Assign_73_74_75_arra {

	public static void main(String[] args) {
		// create Array of size as 5 to store double data type value
		// program to create Array of Char data type to store values Alphabet of size as 5
		//program to create Array of size as 5 to store boolean data type values
		Scanner sc=new Scanner(System.in);
		int [] intarr=new int[5];
		double[] darr= new double[5];
		char[] charr=new char[5];
		boolean[] barr=new  boolean [5];
		darr[0]=45.45;
		darr[1]=5433.55;;
		darr[2]=56;
		darr[3]=52.55;
		darr[4]=4434.34;
		charr[0]='a';
		charr[1]='m';
		charr[2]='0';
		charr[3]='l';
		
		System.out.println(Arrays.toString(darr));
		System.out.println(Arrays.toString(charr));
		System.out.println("enter values in the boolean array");
	barr[0]=sc.nextBoolean();
	barr[1]=sc.nextBoolean();
	barr[2]=sc.nextBoolean();
	barr[3]=sc.nextBoolean();
	barr[4]=sc.nextBoolean();
	System.out.println(Arrays.toString(barr));
		
		

	}

}
