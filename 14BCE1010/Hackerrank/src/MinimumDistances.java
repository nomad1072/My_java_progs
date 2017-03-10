import java.util.*;
public class MinimumDistances {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int flag = 1;
		int n;
		n = s.nextInt();
		int[] a = new int[n];
		for(int i = 0; i < a.length; i++) {
			a[i] = s.nextInt();
		}
		int min = 999;
		for(int i = 0; i < a.length; i++) {
			for(int j = i+1; j<a.length; j++) {
				if(a[i] == a[j]) {
					flag = 0;
					int min1 = Math.abs(i - j);
					if(min1 < min) {
						min = min1;
					}
				}
			}
		}
		if(flag == 0) {
		System.out.println(min);
		}else {
			System.out.println("-1");
		}

	}

}
