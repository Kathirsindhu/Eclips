package conditionday1;

public class TaskPositive {
	public static void main(String[] args) {
		int a = Integer.parseInt(args[0]);
		if (a <= 0) {
			int b = a + 15;
			System.out.println("negative");
			System.out.println(b + "added value with 15");
		} else {
			System.out.println("positive");
		}
	}

}
