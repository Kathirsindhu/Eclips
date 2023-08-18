package day1;

public class String1 {
	public static void main(String[] args) {
		String a = "kathir";
		String b = "vetri";
		System.out.println(a.hashCode());
		System.out.println(b.hashCode());
		a = a.concat(b);
		System.out.println(a.hashCode());
	}
}
