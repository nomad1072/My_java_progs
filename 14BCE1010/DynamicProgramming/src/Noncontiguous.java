import java.util.*;
public class Noncontiguous {

	static Scanner s=new Scanner(System.in);
	public static int ContiguousSubArray(int[] a) {
		int max_ending_here=0;
		int max_ending_so_far=0;
		for(int i=0;i<a.length;i++)
		{
			max_ending_here=max_ending_here+a[i];
			if(max_ending_here<0)
			{
				max_ending_here=0;
			}
			else if(max_ending_so_far<max_ending_here)
			{
				max_ending_so_far=max_ending_here;
			}
		}
		return max_ending_so_far;
		
	}
	public static int sum(int[] a)
	{
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>0)
			{
				sum+=a[i];
			}
		}
		return sum;
	}
	public static void input(int[] a) {
	//	System.out.println("INPUT");
		for(int i=0;i<a.length;i++)
		{
			a[i]=s.nextInt();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int t;
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
			int max_ending_here=0;
			int max_ending_so_far=0;
			for(int j=0;j<a.length;j++)
			{
				max_ending_here=max_ending_here+a[j];
				if(max_ending_here<0)
				{
					max_ending_here=0;
				}
				else if(max_ending_so_far<max_ending_here)
				{
					max_ending_so_far=max_ending_here;
				}
			}
			int sum=0;
			for(int j=0;j<a.length;j++)
			{
				if(a[j]>0)
				{
					sum+=a[j];
				}
			}
			System.out.println(max_ending_so_far+" "+sum);
			
			
			
			
		}
	}

}
