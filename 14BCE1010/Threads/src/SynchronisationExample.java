import java.util.*;
import java.util.concurrent.TimeUnit;
public class SynchronisationExample {

	static int counter = 0;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		int p,c,bufferSize;
		int[] b;
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter number of producer threads");
		p = s.nextInt();
		System.out.println("Enter number of consumer threads");
		c = s.nextInt();
		System.out.println("Enter buffer size");
		bufferSize = s.nextInt();
		b = new int[bufferSize];
		
		Thread[] producers = new Thread[p];
		Thread[] consumers = new Thread[c];
		while(true) {
		for(int i = 0; i < p; i++) {
			producers[i] = new Thread(new Runnable() {

				@Override
				public void run() {
					// TODO Auto-generated method stub
					while(counter == bufferSize) {
						System.out.println("Buffer full");
						break;
					}
				    System.out.println("Thread" + (counter+1) + "produced an item");
					
				}
			});
			producers[i].start();
			b[i]++;
			counter++;
			TimeUnit.SECONDS.sleep(2);
		}
		for(int i = 0; i < p; i++) {
			consumers[i] = new Thread(new Runnable() {

				@Override
				public void run() {
					// TODO Auto-generated method stub
					while(counter == 0) {
						System.out.println("Buffer Empty");
						break;
					}
				    System.out.println("Thread" + (counter+1) + "consumed an item");
					
				}
			});
			consumers[i].start();
			b[i]--;
			counter--;
			TimeUnit.SECONDS.sleep(2);
		}
	}
	}
	

}
