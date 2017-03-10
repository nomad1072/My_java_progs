import java.util.*;
public class BirthdayCakeCandles {
	public static int findMax(int[] a) {
		int largest = a[0];
		for(int i = 1; i < a.length; i++) {
			if(a[i] > largest) {
				largest = a[i];
			}
		}
		return largest;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = 0;
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int[] a = new int[n];
		for(int i = 0; i < n; i++) {
			a[i] = s.nextInt();
		}
		int x = findMax(a);
		for(int i = 0; i < n; i++) {
			if(x == a[i]) {
				count++;
			}
		}
		System.out.println(count);

	}

}
