package com.bridgelabz.Commandline;

public class CommandLineGame {
	static Integer a2 = 0;

	public static void main(String[] args) {
		try {
			Integer I1 = Integer.parseInt(args[0]);
			Integer I2 = Integer.parseInt(args[1]);
			Integer I3 = Integer.parseInt(args[2]);
			Integer I4 = Integer.parseInt(args[3]);
			Integer sum = I1 + I2 + I3 + I4;
			System.out.println("The sum of integers are: "+sum);

		} catch (NumberFormatException e) {
			System.out.println("Invalid integer command line arguments: " + e.toString());
		}

	}
}