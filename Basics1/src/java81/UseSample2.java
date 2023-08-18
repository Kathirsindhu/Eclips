package java81;

public class UseSample2 {
	public static void main(String[] args) {
		Sample2 s = (a) -> {
			for (int i = 0; i < a.length; i++) {
				if (a[i] % 3 == 0 && a[i] % 2 != 0) {
					System.out.println(a[i] + " success");
				} else {
					System.out.println(a[i] + " is not in condition");
				}
			}
		};
		int[] a = { 3, 6, 5, 9, 12 };
		s.findCondition(a);
	}
}
