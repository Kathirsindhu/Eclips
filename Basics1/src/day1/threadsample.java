package day1;

public class threadsample extends Thread {
	public void run() {
		System.out.println("hello");
	}

	public static void main(String[] args) {

		threadsample t = new threadsample();
		t.start();
		System.out.println("hai");
	}
}
