package conditionday1;

public class Demo {
	public static void main(String[] arg) {
		String call = arg[0];
		String toss = arg[1];
		if (call.equalsIgnoreCase(toss)) {
			System.out.println("you win");
		}
		else {
			System.out.println("you lose");
		}
	}

}
