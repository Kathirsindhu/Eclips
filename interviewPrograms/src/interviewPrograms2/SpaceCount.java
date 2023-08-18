package interviewPrograms2;

import java.util.Arrays;

public class SpaceCount {
	public static void main(String[] args) {
		String[] a = { "rajesh", " ", "samueal", " ", " " };
		Long b = Arrays.stream(a).filter(x -> x.equals(" ")).count();
		System.out.println(b);
	}
}
