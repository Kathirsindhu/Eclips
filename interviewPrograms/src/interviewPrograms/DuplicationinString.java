package interviewPrograms;

import java.util.HashMap;

public class DuplicationinString {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String word = "suceess";
		char[] c = word.toCharArray();
		HashMap<Character, Integer> map = new HashMap<>();
		for (int i = 0; i < c.length; i++) {

			if (map.containsKey(c[i])) {
				map.put(c[i], map.get(c[i]) + 1);

			} else {
				map.put(c[i], 1);
			}
		}
		System.out.println(map);
		map.forEach((x, y) -> {
			if (y > 1) {
				System.out.println(x + "=" + y);
			}
		});
	}
}
