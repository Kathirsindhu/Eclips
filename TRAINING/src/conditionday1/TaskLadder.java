package conditionday1;

public class TaskLadder {
	public static void main(String[] args) {
		int num = Integer.parseInt(args[0]);
		if (num >= 6 && num <= 12) {
			System.out.println("kid");
		} else if (num > 12 && num <= 20) {
			System.out.println("adult");
		} else if (num > 20 && num <= 30) {
			System.out.println("men");
		} else if (num > 30 && num <= 40) {
			System.out.println("legent");
		} else if (num > 40) {
			System.out.println("ultra legends");
		} else {
			System.out.println("condition is not valid");
		}
	}

}
