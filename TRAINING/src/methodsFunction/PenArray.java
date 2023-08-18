package methodsFunction;

public class PenArray {
	String brand;
	int price;
	int discount;
	String color;

	public int maxPrice(int[] a) {
		int max = a[0];
		for (int i = 0; i < a.length; i++) {

			if (a[i] > max) {
				max = a[i];
			}
		}
		return max;
	}

	public int discounts(int[] a) {
		int max = a[0];
		for (int i = 0; i < a.length; i++) {
			if (a[i] > max) {
				max = a[i];
			}
		}
		return max;
	}

	public String brands(PenArray[] a) {
		PenArray min = a[0];
		for (int i = 0; i < a.length; i++) {
			if (min.price < a[i].price) {
				min = a[i];
			}
		}
		return min.brand;
	}

	public void colour(PenArray[] a) {
		PenArray m = a[0];
		for (int i = 0; i < a.length; i++) {
			if (m.color.equalsIgnoreCase("Blue")) {
				m = a[i];
			}

			System.out.println(m.brand);
		}

	}

	public PenArray penP(PenArray[] a) {
		PenArray m = a[0];
		for (int i = 0; i < a.length; i++) {
			if (m.price > a[i].price) {
				m = a[i];
			}

		}
		return m;
	}

	public void vowels(PenArray[] a) {
		PenArray m = a[0];
		for (int i = 0; i < a.length; i++) {
			char[] ch = a.charAt(i);
			if (ch[i] == 'a' || ch[i] == 'e' || ch[i] == 'i' || ch[i] == 'o' || ch[i] == 'u') {

				m = a[i];
			}

			System.out.println(m.brand);
		}

	}

}
