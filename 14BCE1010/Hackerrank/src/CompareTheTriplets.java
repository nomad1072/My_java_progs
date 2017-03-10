import java.util.AbstractList;
import java.util.List;
import java.util.Scanner;

public class CompareTheTriplets {

	public static Object intArrayAsList(final int a[]) {
		if(a == null) {
			return  new NullPointerException();
		}
		    return new AbstractList<Integer>() {

				@Override
				public Integer get(int index) {
					// TODO Auto-generated method stub
					return a[index];
				}

				@Override
				public int size() {
					// TODO Auto-generated method stub
					return a.length;
				}
				
			};
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int[] alice = new int[3];
		int[] bob = new int[3];
		for(int i = 0; i < 3; i++) {
			alice[i] = s.nextInt();
		}
		for(int i = 0; i < 3; i++) {
			bob[i] = s.nextInt();
		}
		List<Integer> l1 = (List<Integer>) intArrayAsList(alice);
		List<Integer> l2 = (List<Integer>) intArrayAsList(bob);
		int aliceCounter = 0 , bobCounter = 0;
		for(int i = 0; i < 3; i++) {
			int a = l1.get(i);
			int b = l2.get(i);
			if(a > b) {
				aliceCounter++;
			}
			else if(b > a) {
				bobCounter++;
			}
			
		}
		System.out.println(aliceCounter+" "+bobCounter);
		

	}

}
