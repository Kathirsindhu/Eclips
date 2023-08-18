package special;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ThreadLock extends Thread{

	private static Lock lock = new ReentrantLock();

	public static void main(String[] args) {
		Thread thread1 = new Thread(() -> {
			lock.lock();
			try {
				System.out.println("Thread 1 is running");
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			} finally {
				lock.unlock();
			}
		});

		Thread thread2 = new Thread(() -> {
			lock.lock();
			try {
				System.out.println("Thread 2 is running");
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} finally {
				lock.unlock();
			}
		});

		thread1.start();
		thread2.start();
	}
}
