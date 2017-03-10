import java.util.*;
public class AngryProfessor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n;
		int s1,k;
		int count=0;
		int atime;
		n=s.nextInt();
		for(int i=0;i<n;i++)
		{
			s1=s.nextInt();
			k=s.nextInt();
			
			for(int j=0;j<s1;j++)
			{
				atime=s.nextInt();
				if(atime<=0)
				{
					count++;
				}
			}
			if(count<k)
			{
				System.out.println("YES");
			}
			else
			{
				System.out.println("NO");
			}
			count=0;
			
		}
		

	}

}
