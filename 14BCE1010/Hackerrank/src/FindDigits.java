import java.util.*;
public class FindDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int t,d;
		int counter=0;
		long n;
		t=s.nextInt();
		for(int i=0;i<t;i++)
		{
			counter=0;
			n=s.nextLong();
			long m=n;
			while(m!=0)
			{
				d=(int)m%10;
				m=m/10;
				if(d!=0 && n%d==0)
				{
					counter++;
				}
			}
			System.out.println(counter);
		}

	}

}
