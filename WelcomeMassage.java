package com.blz.displayMassage;

public class WelcomeMassage {
	
	public static void main (String[] args) {
		
		//display massage
		System.out.println("Welcome to java");
		
		//display the default value of all primitive data types
		boolean val1 = false;
		double val2 = 0.0d;
		int val3 = 0;
		long val4 = 0l;
		short val5 = 0;
		byte val6 = 0;
		float val7 = 0.0f;
		char c;	
		System.out.println("Default value...");
		System.out.println("val1 = "  +val1);
		System.out.println("val2 = " +val2);
		System.out.println("val3 = " +val3);
		System.out.println("val4 = " +val4);
		System.out.println("val5 = " +val5);
		System.out.println("val6 = " +val6);
		System.out.println("val7 = " +val7);
		
		//compare string 
		String s1 = "riya";
		String s2 = "priya";
		
		String s3 = new String ("riya");
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		
	}
}
