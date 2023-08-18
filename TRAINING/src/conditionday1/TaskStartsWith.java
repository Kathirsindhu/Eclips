package conditionday1;

public class TaskStartsWith {
	public static void main(String[] args) {
		String a = args[0];
		if (a.startsWith("a") || a.startsWith("e") || a.startsWith("i") || a.startsWith("o") || a.startsWith("u")) {
			System.out.println("startswith voewls " + "\nthe first letter is " + a.charAt(0));
		} else {
			System.out.println("startswith consonants " + "\nthe first letter is " + a.charAt(0));
		}
	}
}
