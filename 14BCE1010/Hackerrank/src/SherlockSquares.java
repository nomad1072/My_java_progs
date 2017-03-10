import java.util.*;
public class SherlockSquares {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n;int counter=0;
		n=s.nextInt();
		long a,b;
		
		for(int j=0;j<n;j++)
		{
			 counter=0;
			a=s.nextInt();
			b=s.nextInt();
		for(int i=1;i<=b;i++)
		{
			long m=i*i;
			if(m>=a && m<=b)
			{
				counter++;
			}
			else if(m>b)
			{
				break;
			}
			
		}
		System.out.println(counter);
		}

	}

}
