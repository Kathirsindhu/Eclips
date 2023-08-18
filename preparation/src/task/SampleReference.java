package task;

import java.util.ArrayList;

public class SampleReference {
	public void meth1() {
		ArrayList<Integer> a = new ArrayList<>();
		a.add(10);
		a.add(20);
		meth2(a);
		System.out.println(a.size());
	}

	public void meth2(ArrayList<Integer> x) {
		x.add(30);
		x.add(40);
	}

	public static void main(String[] args) {
		SampleReference sr = new SampleReference();
		sr.meth1();
	}
}
