import java.util.*;
public class DivisibleSumPairs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int count = 0;
		int n = s.nextInt();
		int k = s.nextInt();
		int[] a = new int[n];
		for(int i = 0; i < n; i++) {
			a[i] = s.nextInt();
		}
		for(int i = 0; i < a.length; i++) {
			for(int j = i+1; j < a.length; j++) {
				int m = a[i] + a[j];
				if(m % k == 0) {
					count++;
				}
			}
		}
		System.out.println(count);

	}

}
