import java.util.Scanner;
import java.util.concurrent.locks.StampedLock;

public class StampLock implements Runnable{
	static StampedLock lock = new StampedLock();
	static int amount = 100;
	 long stampLock;
	public void run() {
		read();
		write();
		read();
	}
	public void read() {
		  stampLock = 0;
		try 
		{
			System.out.println("Read Method going on.......");
	      stampLock = lock.readLock();
	      System.out.println(amount);
	      
		}
		catch(Exception e) {
			System.out.println("readMethod interupted");
		}
	
	}
	public void write() {
		long stampLock = 0;
		Scanner scanner = new Scanner(System.in);
		try {
			System.out.println("Write Method Started........");
			 stampLock = lock.writeLock();
			amount = scanner.nextInt();
			System.out.println(amount);	 
		}
		catch(Exception e) {
			System.out.println("Write Method interupted");
		}
		finally {
			scanner.close();
			lock.unlockWrite(stampLock);
			
		}
	}
	public static void main(String[] args) {
		StampLock stampLock = new StampLock();
		Thread thread1 = new Thread(stampLock);
		thread1.start();
		

	}
}
