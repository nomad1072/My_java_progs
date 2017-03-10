import java.util.*;
public class LisaWorkbook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n,k;int pages=0;
		n=s.nextInt();
		k=s.nextInt();
		int[] a=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=s.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			if(a[i]!=0)
			{
				pages++;
			}
		}

	}

}
