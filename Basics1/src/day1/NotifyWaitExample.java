package day1;

class SharedResource {
	public synchronized void printMessage(String message) {
		System.out.println("Thread: " + Thread.currentThread().getName() + " is executing.");
		System.out.println(message);
	}

	public synchronized void waitForNotification() {
		try {
			System.out.println("Thread: " + Thread.currentThread().getName() + " is waiting.");
			SharedResource.class.wait(3000);
			System.out.println("Thread: " + Thread.currentThread().getName() + " is awake now.");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public synchronized void notifyWaitingThread() {
		System.out.println("Notifying the waiting thread.");
		notify(); // Notify a single waiting thread to wake up
	}
}

public class NotifyWaitExample {
	public static void main(String[] args) {
		SharedResource sharedResource = new SharedResource();

		Thread waitingThread = new Thread(() -> sharedResource.waitForNotification(), "WaitingThread");
		Thread notifyingThread = new Thread(() -> {
			sharedResource.printMessage("This is a message from the notifying thread.");
			sharedResource.notifyWaitingThread();
		}, "NotifyingThread");

		waitingThread.start();
		notifyingThread.start();
	}
}
