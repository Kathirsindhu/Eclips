package conditionday1;

public class TaskAnd {
	public static void main(String[] args) {
		int a = Integer.parseInt(args[0]);
		if (a % 2 == 0 && a % 4 == 0) {
			System.out.println("divisible by both");
		} else {
			System.out.println(" condition not pass");
		}
	}

}
