package interviewPrograms;

public class Leap {
	public static void main(String[] args) {
		int a = 1100;
		if (a % 4 == 0 && a % 100 != 0 || a % 400 == 0) {
			System.out.println("Leap year");
		} else {
			System.out.println("not a leap year");
		}
	}
}
