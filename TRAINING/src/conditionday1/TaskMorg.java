package conditionday1;

public class TaskMorg {
	public static void main(String[] args) {
		int n = Integer.parseInt(args[0]);
		if (n >= 1 && n <= 6) {
			System.out.println("good morning");

		} else if (n > 6 && n <= 12) {
			System.out.println("Good afternoon");
		} else if (n > 12 && n <= 18) {
			System.out.println("Good evening");
		} else if (n > 18 && n <= 24) {
			System.out.println("Good night");
		} else {
			System.out.println("invalide");
		}
	}

}
