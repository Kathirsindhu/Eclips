package conditionday1;

public class TaskVowels {
	public static void main(String[] args) {
		String a = args[0];
		if (a.contains("a") || a.contains("e") || a.contains("i") || a.contains("o") || a.contains("u")) {
			System.out.println("vowel placed");
		} else {
			System.out.println("consonants placed");
		}
	}

}
