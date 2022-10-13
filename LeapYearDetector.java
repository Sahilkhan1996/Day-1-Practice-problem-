import java.util.Scanner;

public class LeapYearDetector {
	static boolean leap;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any Year: ");
		int input = sc.nextInt();
		leapyearchecker(input);
		if (leap) {
			System.out.println(input + " is a leap year");
		} else {
			System.out.println(input + " is not a leap year");
		}
		sc.close();
	}

	private static void leapyearchecker(int input) {
		if (input >= 1582) {
			if (input % 4 == 0) {
				if (input % 100 == 0) {
					if (input % 400 == 0) {
						leap = true;
					} else {
						leap = false;
					}
				} else {
					leap = true;
				}
			} 
		}
	}
}