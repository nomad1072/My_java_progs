import java.util.*;
public class FunnyString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n;
		n=s.nextInt();
		for(int i=0;i<n;i++)
		{
			String s1;
			s1=s.next();
			StringBuilder s2=new StringBuilder(s1);
			s2.reverse();
			
			
			System.out.println(s2);
			int flag=0;
			for(int j=1;j<s1.length();j++)
			{
				if(Math.abs((int)s1.charAt(j)-(int)s1.charAt(j-1))==Math.abs((int)s2.charAt(j)-(int)s2.charAt(j-1)))
				{
					flag=0;
				}
				else
				{
					flag=1;
					break;
				}
			}
			if(flag==0)
			{
				System.out.println("Funny");
			}
			else
			{
				System.out.println("Not Funny");
			}
		}
		
	}

}
