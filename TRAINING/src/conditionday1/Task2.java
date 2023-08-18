package conditionday1;

public class Task2 {
	public static void main(String[] arg) {
		int a = Integer.parseInt(arg[0]);
		if (a >= 18) {
			System.out.println("Eligible for voting");
		} else {
			System.out.println("not eligible for voting");
		}
	}

}
