package conditionday1;

public class TaskRating {
	public static void main(String[] arg) {
		int a = Integer.parseInt(arg[0]);
		if (a == 1) {
			System.out.println("bad");
		} else if (a == 2) {
			System.out.println("bad");
		} else if (a == 3) {
			System.out.println("average");
		} else if (a == 4) {
			System.out.println("good");
		} else if (a == 5) {
			System.out.println("excellent");
		} else {
			System.out.println("invalid");
		}
	}
}
