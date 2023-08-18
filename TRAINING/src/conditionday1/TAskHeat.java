package conditionday1;

public class TAskHeat {
	public static void main(String[] args) {
		int a = Integer.parseInt(args[0]);
		if (a >= 17 && a <= 20) {
			System.out.println("very cool");

		} else if (a > 20 && a <= 24) {
			System.out.println("cool");

		} else if (a > 24 && a <= 28) {
			System.out.println("average");
		} else if (a > 28 && a <= 30) {
			System.out.println("room temp");
		} else if (a > 30) {
			System.out.println("hot");
		} else {
			System.out.println("invalid");
		}
	}

}
