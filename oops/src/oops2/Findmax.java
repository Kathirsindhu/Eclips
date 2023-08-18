package oops2;

public class Findmax {
	public int findMaximum(int a, int b) {
		if (a > b) {
			return a;
		} else {
			return b;
		}
	}

	public int findMaximum(int[] a) {
		int max = a[0];
		for (int i = 0; i < a.length; i++) {
			if (a[i] >= max) {
				max = a[i];
			}
		}
		return max;
	}
}
