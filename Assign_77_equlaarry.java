package dailyassignments;

import java.util.Arrays;
import java.util.Scanner;

public class Assign_77_equlaarry {

	public static void main(String[] args) {
		// program to check if 2 Arrays are equals or not
		Scanner sc=new Scanner (System.in);
		int [] arr1=new int[5];
		int [] arr2=new int[5];
		int check_number=56;//Write a program to check if the given number is part of an Array or not
		for( int i=0; i<=4; i++)
		{
			System.out.println("index is " + i);
		
		arr1[i]=sc.nextInt();
		arr2[i]=sc.nextInt();
		}
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
		 boolean b1=Arrays.equals(arr1, arr2);
		 System.out.println(b1);
		 for (int i=0;i<=4;i++)
		 {
		 if(arr1[i]==56)
		 {
			 System.out.println("number match");
		 }
	}
	
}
}