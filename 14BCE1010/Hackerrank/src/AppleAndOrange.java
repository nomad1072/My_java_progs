import java.util.*;
public class AppleAndOrange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner z = new Scanner(System.in);
		int s,t,a,b,m,n;
		s = z.nextInt();
		t = z.nextInt();
		a = z.nextInt();
		b = z.nextInt();
		m = z.nextInt();
		n = z.nextInt();
		int[] apples = new int[m];
		int[] oranges = new int[n];
		
		for(int i = 0; i < apples.length; i++) {
			apples[i] = z.nextInt();
			apples[i] += a;
		}
		for(int i = 0; i < oranges.length; i++) {
			oranges[i] = z.nextInt();
			oranges[i] += b;
		}
		int count = 0, count1 = 0;
		for(int i = 0; i < apples.length; i++) {
			if(apples[i] >= s && apples[i] <= t) {
				count++;
			}
		}
		for(int i = 0; i < oranges.length; i++) {
			if(oranges[i] >= s && oranges[i] <= t) {
				count1++;
			}
		}
		System.out.println(count);
		System.out.println(count1);
		

	}

}
