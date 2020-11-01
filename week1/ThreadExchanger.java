

 import java.util.Scanner;
 import java.util.Stack;
 class Assigner implements Runnable{

		@Override
		public void run() {
			System.out.println("assigner");
			if(!ThreadExchanger.bucket.isEmpty()) {
				System.out.println(ThreadExchanger.bucket.pop());
			}
			
		}

	}
 class Checker implements Runnable{

		@Override
		public void run() {
			System.out.println("checker");
			int bulbCount = ThreadExchanger.productionCount;
			System.out.println(bulbCount);
			for(int ctr=0;ctr<bulbCount;ctr++) {
			
			   ThreadExchanger.bucket.add("bulb");
			}
			
		
		}
			
	}
 public class  ThreadExchanger {
 	static Stack<String> bucket = new Stack<>();
 	
     static int productionCount = 0;
 	public static void main(String[] args) {
 		Scanner scanner = new Scanner(System.in);
 		String production;
 		do {
 			Assigner assigner = new Assigner();
 			Checker checker = new Checker();
 			 production = scanner.nextLine();
 			productionCount = scanner.nextInt();
 			System.out.println("thraed1");
 			Thread thread1 = new Thread(checker);
 			System.out.println("thraed2");
 			Thread thread2 = new Thread(assigner);
 			thread1.start();
 			try {
 				thread1.join();
 			} catch (InterruptedException e) {

 				e.printStackTrace();
 			}
 			thread2.start();
 			
 		}
 		while(!production.equals("stop"));
 		System.out.println(bucket);
 		scanner.close();
    
 	}

 }
