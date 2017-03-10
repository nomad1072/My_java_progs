import java.util.*;
public class LoveLetter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=0;int m=0;
		n=s.nextInt();
		for(int i=0;i<n;i++)
		{
			m=0;
			String s1=s.next();
			char[] a=s1.toCharArray();
			int j=0;
			int k=a.length-1;
			while(j<k)
			{
				
				int t=Math.abs(a[k]-a[j]);
				m=m+t;
				
				
				j++;k--;
						
			}
			
			System.out.println(m);
			
		}
		

	}

}
