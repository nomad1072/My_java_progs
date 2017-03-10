import java.util.*;
public class BeautifulTriplets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = 0;
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int d = s.nextInt();
		int[] a = new int[n];
		for(int i = 0; i < a.length; i++) {
			a[i] = s.nextInt();
		}
		for(int i = 0; i < a.length - 2; i++) {
			
			for(int j = i+1; j < a.length - 1; j++) {
				
				for(int k = j+1; k < a.length; k++) {
					int l = a[j] - a[i];
					int m = a[k] - a[j];
					if(l == m && m == d) {
						count++;
					}
				}
			}
		}
		System.out.println(count);

	}

}
