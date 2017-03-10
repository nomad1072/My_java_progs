import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class CallableExample implements Callable {
	int i,j;
	int[] a;
	public CallableExample(int i, int j, int[] a) {
		this.i = i;
		this.j = j;
		this.a = a;
		
	}

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		// TODO Auto-generated method stub
		int[] a = {1,2,3,4,5,6,7,8,9};
		int i = 0;
		int j = a.length/3 ;
		ExecutorService pool = Executors.newFixedThreadPool(3);
		List<Future<Integer>> list = new ArrayList<Future<Integer>>();
		for (int k = 0; k < 3; k++) {
			Callable<Integer> callable = new CallableExample(i,j,a);
			i = i + 3;
			j = j + 3;
			Future<Integer> future = pool.submit(callable);
			list.add(future);
		}
		int sum = 0;
		for(Future<Integer> future1:list) {
			sum += future1.get();
		}
		
		System.out.println("Array sum is:" + sum);

	}

	@Override
	public Object call() throws Exception {
		// TODO Auto-generated method stub
	 
			int sum = 0;
		
		for(int k = i; k < i+3; k++) {
			sum += a[k];
		}
		TimeUnit.SECONDS.toMillis(2000);
		
		return sum;
	}

}
