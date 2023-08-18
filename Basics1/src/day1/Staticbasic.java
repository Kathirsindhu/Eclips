package day1;

public class Staticbasic {
	public static void main(String[] args) {
//		Staticbasic s1 = new Staticbasic();
//		Staticbasic s2 = new Staticbasic();
//		Staticbasic s3 = new Staticbasic();
		Staticbasic.print();
		System.out.println(Staticbasic.a);

	}

	static int a = 10;

	public Staticbasic() {
		a++;
		System.out.println(a);
	}

	static {
		System.out.println("hello");
	}

	public static void print() {
		System.out.println("this is static method");
	}

}
