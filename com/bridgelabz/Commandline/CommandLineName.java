package com.bridgelabz.Commandline;

public class CommandLineName {
	static String s1="";
	public static void main(String[] args) {
		for (int i = 0; i < args.length; i++) {
			s1=s1.concat(args[i]+" ");
		}
		System.out.println("The Entered Name is: "+s1);
	}
}
