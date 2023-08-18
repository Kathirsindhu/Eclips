package interviewPrograms;

public class CountofRepeatedValues {
	public static void main(String[] args) {
		String a = "Nishanthi";
		int aa = 0;
		int bb = 0;
		char[] b = a.toCharArray();
		System.out.println(b);
		for (int i = 0; i < b.length; i++) {
			for (int j = i + 1; j < b.length; j++) {
				if (b[i] == b[j]) {
					aa++;
				} else {
					bb++;
				}
			}
		}
		System.out.println(aa + " " + bb);
	}
}
