package conditionday1;

public class Tasksquare {
	public static void main(String[] args) {
		int length = Integer.parseInt(args[0]);
		int breath = Integer.parseInt(args[1]);
		if ((length == breath)) {
			System.out.println("square");
		} else {
			System.out.println("not a square");
		}
	}

}
