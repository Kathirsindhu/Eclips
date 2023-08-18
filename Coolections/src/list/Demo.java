package list;

import java.util.ArrayList;

public class Demo {
	public static void main(String[] args) {
		ArrayList<Integer> nums = new ArrayList<>();
		nums.add(1);
		nums.add(2);
		nums.add(3);
		nums.add(4);
		nums.add(5);
		// nums.add(1, 5);
		// System.out.println(nums.get(1));
		// System.out.println(nums.get(2));
		nums.set(0, 1190);
		nums.remove(0);
		// System.out.println(nums);
		// System.out.println(nums);
		for (int i = 0; i < nums.size(); i++) {
			if (nums.get(i) % 2 == 0) {

				// System.out.println(nums.get(i));
			}

		}
		for (int a : nums) {
			System.out.println(a);
		}
		ArrayList<Integer> oddnums = new ArrayList<>();
		for (int i = 0; i < nums.size(); i++) {
			if (nums.get(i) % 2 != 0) {

				oddnums.add(nums.get(i));
			}

		}
		System.out.println(oddnums);

	}
}