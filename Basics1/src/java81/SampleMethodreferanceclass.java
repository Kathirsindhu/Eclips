package java81;

public class SampleMethodreferanceclass {
	public void sample1(int[] a) {
		int min = a[0];
		for (Integer x : a) {
			if (x < min) {
				min = x;
			}
		}
		if (min % 2 == 0) {
			System.out.println(min + " is even");

		} else {
			System.out.println(min + " is odd");
		}

	}
}
