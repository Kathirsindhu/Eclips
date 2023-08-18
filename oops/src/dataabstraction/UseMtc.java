package dataabstraction;

public class UseMtc {
	public static void main(String[] args) {
		Mtc m1 = new Mtc();
		m1.model();
		System.out.println(m1.type());
		System.out.println(m1.brand());
		System.out.println(m1.fare(10));
		System.out.println(m1.board());

	}
}
