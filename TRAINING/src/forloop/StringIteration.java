package forloop;

public class StringIteration {
	public static void main(String[] args) {
		String ac = "onesoft";
		for (int i = 0; i < ac.length(); i++) {
			System.out.println(ac.charAt(i));
		}
		char[] b = ac.toCharArray();
		for (int i = 0; i < ac.length(); i++) {
			System.out.println(b[i]);
		}

	}
}
