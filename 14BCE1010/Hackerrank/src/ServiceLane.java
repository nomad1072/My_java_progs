import java.util.*;
public class ServiceLane {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n;
		n=s.nextInt();
		int t;
		
		int y,z;
		t=s.nextInt();
		int[] w=new int[n];
		int small;
		for(int i=0;i<n;i++)
		{
			w[i]=s.nextInt();
		}
		for(int i=0;i<t;i++)
		{
			y=s.nextInt();
			z=s.nextInt();
			small=w[y];
			for(int j=y;j<=z;j++)
			{
				if(w[j]<small)
				{
					small=w[j];
				}
			}
			System.out.println(small);
		}

	}

}
