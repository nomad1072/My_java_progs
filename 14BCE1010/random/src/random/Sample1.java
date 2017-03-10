package random;

import java.util.AbstractList;
import java.util.List;
import java.util.*;

public class Sample1 {

	static List<Integer> intArrayAsList(final int[] a) {
		if(a == null) {
			throw new NullPointerException();
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
		int n = s.nextInt();
		int[] a = new int[n];
		for(int i = 0; i<n;i++) {
			a[i] = s.nextInt();
		}
		List<Integer> l = new ArrayList();
		l = intArrayAsList(a);
		
		System.out.println(l);

	}

}
