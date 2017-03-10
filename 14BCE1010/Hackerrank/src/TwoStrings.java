import java.util.*;
public class TwoStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int t;
		t=s.nextInt();
		for(int i=0;i<t;i++)
		{
			String s1=s.nextLine();
			String s2=s.nextLine();
			StringBuilder s3=new StringBuilder(s2);
			int flag=1;
			for(int j=0;j<s1.length();j++)
			{
				char ch=s1.charAt(j);
				for(int k=0;k<s3.length();k++)
				{
					if(ch!=s3.charAt(k))
					{
						flag=0;
					}
					else
					{
						flag=1;
						s3.setCharAt(k,'0');
						break;
					}
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
