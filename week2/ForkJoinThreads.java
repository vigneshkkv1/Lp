class Thread1 implements Runnable{
	
	public void run() {
		System.out.println("Thread 1");
	}
}
class Thread2 implements Runnable{
		
		public void run() {
			System.out.println("Thread 2");
		}
}
class Thread3 implements Runnable{
			
			public void run() {
				System.out.println("Thread 3");
			}
}
class Thread4 implements Runnable{
				
				public void run() {
					System.out.println("Thread 4");
				}
}
public class ForkJoinThreads {
	public static void main(String[] args) {
		Thread1 thread1 = new Thread1();
		Thread2 threadb = new Thread2();
		Thread3 Threadc = new Thread3();
		Thread4 threadd = new Thread4();
		
		Thread t1 = new  Thread(thread1);
		Thread t2 = new  Thread(threadb);
		Thread t3 = new  Thread(Threadc);
		Thread t4 = new  Thread(threadd);
		t4.start();
		try {
			t4.join();
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		t3.start();
		try {
			t3.join();
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		t2.start();
		t1.start();
		
	}
	}


