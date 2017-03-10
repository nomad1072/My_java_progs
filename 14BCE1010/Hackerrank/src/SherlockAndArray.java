import java.util.*;
public class SherlockAndArray {
	public static int findSumLeft(int j,int a[])
	{
		int sum=0;
		for(int i=0;i<j;i++)
		{
			sum+=a[i];
		}
		return sum;
	}
	public static int findSumRight(int j,int a[])
	{
		int sum=0;
		for(int i=j+1;i<a.length;i++)
		{
			sum+=a[i];
		}
		return sum;
	}

	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		int t;int flag=0;
		t=s.nextInt();
		for(int i=0;i<t;i++)
		{
			int n;
			n=s.nextInt();
			int[] a=new int[n];
			for(int j=0;j<a.length;j++)
			{
				a[j]=s.nextInt();
			}
			for(int j=1;j<a.length-1;j++)
			{
				int b=findSumLeft(j,a);
				int c=findSumRight(j,a);
				if(b==c)
				{
					flag=1;
					break;
				}
			}
			if(flag==1)
			{
				System.out.println("YES");
			}
			else
			{
				System.out.println("NO");
			}
			

		}
	}
}
