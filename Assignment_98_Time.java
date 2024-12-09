package dailyassignments;

import java.util.Date;

public class Assignment_98_Time {

	public static void main(String[] args) {
		// Write a program to find out Current time, Future Time,Past time
  Date d1=new Date();
  long l = d1.getTime();
  System.out.println(l);
 // Date d2=new Date(d1.getTime());//current time 
  //Date d2=new Date(d1.getTime() +(1000*60*60*24*1));//1 day ahead future time
  Date d2=new Date(d1.getTime()-(1000*60*60*24*1));//1 day back .past  time 
  System.out.println(d2);
  System.out.println(d2);
    String s2=d2.toString();
    String s3=s2.substring(4, 7);
    String s4=s2.substring(8, 11);
    String s5=s2.substring(s2.length()-4);
    System.out.println(" current date is " +s3+ " " +s4 + " " +s5);
 
    System.out.println(s2.substring(4, 7));
    System.out.println(s2.substring(8, 11));
    System.out.println(s2.substring(s2.length()-4));
  
	}

}
