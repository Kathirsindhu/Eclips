package interviewPrograms;

public class Secondlargestinarray {
	public static void main(String[] args) {
		int[] a = { 100, 14, 46, 47, 94, 94, 52, 86, 36, 99, 89 };
		int large = 0;
		int second = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] > large) {
				second = large;
				large = a[i];
			} else if (a[i] > second) {
				second = a[i];
			}
		}
		System.out.println(large + " " + second);
	}
}
