package special;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		Thread t1 = new Thread(() -> {
			for (int i = 0; i < 4; i++) {
				System.out.println("Thread 1: " + i);
				if (i % 2 == 0) {
					Thread.yield();
				}
			}
		});

		Thread t2 = new Thread(() -> {
			for (int i = 0; i < 4; i++) {
				System.out.println("Thread 2: " + i);
			}
		});

		t1.start();
		t2.start();
	}
}
