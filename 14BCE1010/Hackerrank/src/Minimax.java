import java.math.BigInteger;
import java.util.*;
public class Minimax  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		BigInteger[] a = new BigInteger[5];
		
		
		for(int i = 0; i < a.length; i++) {
			a[i] = s.nextBigInteger();
			
		}
		Arrays.sort(a);
		BigInteger count = BigInteger.ZERO; 
		BigInteger count1 = BigInteger.ZERO; 
		for(int i = 0; i < a.length - 1; i++) {
			count = count.add(a[i]);
		}
		for(int i = 1; i < a.length; i++) {
			count1 = count1.add(a[i]);
		}
		System.out.println(count+ " "+ count1 );
		
	}

	

}
