package com.blz.displayMassage;

public class LeapYear {
	
	public static void main(String[] args) {	
	LeapYear yr = new LeapYear(2000);
	LeapYear yr1 = new LeapYear(1800);
	}
	
	public LeapYear(int yr) {
		if(((yr % 4 == 0) && (yr % 100 != 0) || (yr % 400 == 0))) {
			System.out.println(yr + "is a leap year");
		} else {
			System.out.println(yr + " is not a leap year");
		}
	}
}
