package java81;

public class UseSampleMethodreferance {
	public static void main(String[] args) {
		SampleMethodreferanceclass s = new SampleMethodreferanceclass();
		SampleMethodreferance d = s::sample1;
		int[] nums = { 1, 2, 3, 4, 5, 6, 7, 89 };
		d.sample(nums);

	}
}
