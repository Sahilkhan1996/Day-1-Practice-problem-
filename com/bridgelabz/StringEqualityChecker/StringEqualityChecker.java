package com.bridgelabz.StringEqualityChecker;

public class StringEqualityChecker {
	public static void main(String[] args) {
		String s1 = "Sahil";
		String s2 = "Sahil";
		String s3 = "Khan";
		if (s1.equals(s2)) {
			System.out.println("String is equal");
		} else {
			System.out.println("String are unequal");
		}
		
		if (s1.equals(s3)) {
			System.out.println("String is equal");
		} else {
			System.out.println("String are unequal");
		}
		
	}
}
