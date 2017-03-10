import java.util.Scanner;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;

public class ProducerConsumer {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		BlockingQueue queue = new ArrayBlockingQueue<>(10);
		Producer produce = new Producer(queue);
		Consumer consume = new Consumer(queue);
		new Thread(produce).start();
		new Thread(produce).start();
		new Thread(consume).start();
		new Thread(consume).start();
		
		
	}


}
class Producer implements Runnable {
	public BlockingQueue queue;
	int item = 1;
	public Producer(BlockingQueue q) {
		this.queue = q;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		    while(true) {
			try {
				TimeUnit.SECONDS.sleep(2);
				queue.put(item);
				item ++;
				System.out.print("  produced an item" + item + "\n");
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
	}
}
class Consumer implements Runnable {
	public BlockingQueue queue;
	public Consumer(BlockingQueue q) {
		this.queue = q;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
			while(true) {	try {
				TimeUnit.SECONDS.sleep(2);
				int item = (int)queue.poll();
				System.out.println(" consumed an item" + item + "\n");
			 } catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			
		     }
			}
	}
	
}

	
	
