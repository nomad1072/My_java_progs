import java.math.BigInteger;
import java.util.*;
public class KaprekarNumber {

	int[] m=new int[2];
	public static int findCount(long a)
	{
		long b=a;
		int counter=0;
		while(b!=0)
		{
			b=b/10;
			counter++;
		}
		return counter;
	}
	public static void findDigits(long a)
	{
		int z=findCount(a);
		if(z%2==0)
		{
			for(int i=0;i<z/2;i++)
			{
				
			}
		}
		else
		{
			
		}
	}
   
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		long a;
		int p,q;
		p=s.nextInt();
		q=s.nextInt();
		for(int i=p;i<=q;i++)
		{
			a=(long)i*i;
			findDigits(a);
		}
		

	}

}
