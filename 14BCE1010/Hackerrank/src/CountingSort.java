import java.util.*;
public class CountingSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n;
		n=s.nextInt();
		int[] a=new int[100000];
		int[] b=new int[100000];
		for(int i=0;i<n;i++)
		{
			a[i]=s.nextInt();
			
		}
		for(int i=0;i<n;i++)
		{
			int m=a[i];
			b[m]++;
		}
		for(int i=0;i<n;i++)
		{
			if(i<n)
			{
			System.out.print(b[i]+" ");
			}
		}
	   

	}

}
