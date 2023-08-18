package oops2;

public class UseFindMax {
	public static void main(String[] args) {
		int[] num = { 5, 8, 6, 7, 4, 5 };
		Findmax l1 = new Findmax();
		System.out.println(l1.findMaximum(num));
		System.out.println(l1.findMaximum(8, 9));
	}
}
