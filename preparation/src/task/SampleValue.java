package task;

public class SampleValue {
	public void meth1() {
		int a = 10;
		meth2(a);
		System.out.println(a);
	}

	public void meth2(int x) {
		x = x + 10;
	}

	public static void main(String[] args) {
		SampleValue sv = new SampleValue();
		sv.meth1();
	}
}
