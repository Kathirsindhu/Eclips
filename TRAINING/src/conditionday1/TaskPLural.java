package conditionday1;

public class TaskPLural {
	public static void main(String[] args) {
		String a = args[0];
		if (a.endsWith("s")) {
			System.out.println("it is a plural word");
		}
		else {
			System.out.println("it is a singular word");
		}
	}
}
