import java.util.*;
import java.math.*;
public class FibonacciModified {
    public static void calculateFibonacci(int n,BigInteger a,BigInteger b)
    {
    	BigInteger[] result=new BigInteger[n];
    	result[0]=a;
    	result[1]=b;
    	
    	for(int i=2;i<n;i++)
    	{
    		result[i]=(result[i-1].multiply(result[i-1])).add(result[i-2]);
    	}
    	System.out.println(result[n-1]);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		BigInteger a,b;
		int n;
		a=s.nextBigInteger();
		b=s.nextBigInteger();
		n=s.nextInt();
		calculateFibonacci(n,a,b);
        		

	}

}
