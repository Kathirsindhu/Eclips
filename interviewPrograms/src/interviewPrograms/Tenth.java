package interviewPrograms;

public class Tenth {
	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 5, 8, 9, 6, 7 };
		int cunt = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] * a[i] > 20) {
				System.out.println(a[i]);
				cunt++;
			}
		}
		System.out.println(cunt);
	}
}
