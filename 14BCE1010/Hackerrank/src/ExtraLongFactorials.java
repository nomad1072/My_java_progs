import java.math.BigInteger;
import java.util.Scanner;

public class ExtraLongFactorials {
	public static void calculateFactorial(int n)
	{
		BigInteger result=BigInteger.ONE;
		for(int i=1;i<=n;i++)
		{
			result=result.multiply(BigInteger.valueOf(i));
		}
		System.out.println(result);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		calculateFactorial(n);

	}

}
