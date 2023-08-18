package conditionday1;

public class TaskGrades {
	public static void main(String[] args) {
		int a = Integer.parseInt(args[0]);
		if (a > 60 && a <= 75) {
			System.out.println("third class");
		} else if (a > 75 && a <= 90) {
			System.out.println("second class");
		} else if (a > 90) {
			System.out.println("First class");
		}
	}

}
