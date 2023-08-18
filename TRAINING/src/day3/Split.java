package day3;

public class Split {
	public static void main(String[] arg) {
		String a = "java application";
		String[] b = a.split("a");
		System.out.println(b.length);
		System.out.println(b[0].length());
		System.out.println(b[1]);
		System.out.println(b[2]);
		System.out.println(b[3]);
		System.out.println(b[4]);
	}

}
