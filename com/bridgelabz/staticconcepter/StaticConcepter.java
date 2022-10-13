package com.bridgelabz.staticconcepter;

public class StaticConcepter {
	// Data Types
	static byte b1;
	static short s1;
	static int i1;
	static long l1;
	static float f1;
	static double d1;
	static char ch1;
	static boolean bo1;
	static{
		System.out.println("Welcome to the static world of Java");
		System.out.println("Static block executed");
	}

	public static void main(String[] args) {
		System.out.println("-----------------------------------------");
		System.out.println("Static variables with the default values: ");
		System.out.println("Byte value: "+b1);
		System.out.println("short value: "+s1);
		System.out.println("int value: "+i1);
		System.out.println("long value: "+l1);
		System.out.println("float value: "+f1);
		System.out.println("double value: "+d1);
		System.out.println("char value: "+ch1);
		System.out.println("boolean value: "+bo1);
		
		//calling static method
		System.out.println("---------------------------------------");
		System.out.println("Calling static method");
		staticmethod();
		
	}
	static void staticmethod() {
		System.out.println("static method executed");
	}
}
