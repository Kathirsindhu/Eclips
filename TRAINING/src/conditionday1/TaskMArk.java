package conditionday1;

public class TaskMArk {
	public static void main(String[] args) {
		int mark = Integer.parseInt(args[0]);
		if (mark >= 35) {
			System.out.println("pass");
		} else {
			System.out.println("fail");
		}
	}

}
