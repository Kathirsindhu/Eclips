package conditionday1;

public class DemoInt {
	public static void main(String[] arg) {
		int num = Integer.parseInt(arg[0]);
		if (num%2 == 0) {
			System.out.println(num + " is even nuber");
		}
		else {
			System.out.println(num +"is odd number");
		}
	}

}
