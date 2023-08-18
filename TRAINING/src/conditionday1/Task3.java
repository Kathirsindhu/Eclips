package conditionday1;

public class Task3 {
	public static void main(String[] args) {
		int age = Integer.parseInt(args[0]);
		if (age >= 55) {
			System.out.println("eligible for reteirment");
		} else {
			System.out.println("Not eligible for reteirment ");
		}
	}
}
