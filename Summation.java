package com.blz.displayMassage;

public class Summation {

	public static void main(String[] args) {
		int n;
		int count = 0;
		int sum = 0;
		
		for (int i = 0; i < args.length; i++) {
			try {
				n= Integer.parseInt(args[i]);
				sum = sum+n;
				} catch (NumberFormatException e) {
				count++;
				}
			}
				System.out.println("Sum of only valid integers is =" +sum);
				System.out.println("Invalid Integers:" +count);
				System.out.println("Sum:" +sum);
	}
}
