package conditionday1;

public class TaskMaximum {
	public static void main(String[] args) {
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		int c = Integer.parseInt(args[2]);
		if (a > b && a > c) {
			System.out.println(a + "a is greater");
		} else if (b > a && b > c) {
			System.out.println(b + "b is greater");
		} else {
			System.out.println(c + "c is greater");
		}
	}

}
