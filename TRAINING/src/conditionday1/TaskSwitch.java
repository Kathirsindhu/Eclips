package conditionday1;

public class TaskSwitch {
	public static void main(String[] args) {
		int a = Integer.parseInt(args[0]);
		switch (a) {
		case 1:
			System.out.print("Sunday");
			break;
		case 2:
			System.out.println("monday");
			break;
		case 3:
			System.out.println("tuesday");
			break;
		case 4:
			System.out.println("wednewday");
			break;
		case 5:
			System.out.println("thursday");
			break;
		case 6:
			System.out.println("Friday");
			break;
		case 7:
			System.out.println("saturday");
			break;
		default:
			System.out.println("enter valid day");
			break;
		}

	}
}
