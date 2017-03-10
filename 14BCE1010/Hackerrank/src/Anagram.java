import java.util.*;
public class Anagram {
    public static int deletions(String s1,String s2)
    {
    	int del=0;
		StringBuilder s3=new StringBuilder(s2);
		for(int i=0;i<s1.length();i++)
		{
			char ch=s1.charAt(i);
			int flag=1;
			
			for(int j=0;j<s2.length();j++)
			{
				if(ch!=s3.charAt(j))
				{
					flag=0;
				}
				else
				{
					flag=1;
					s3.setCharAt(j,'0');
					break;
				}
			}
			if(flag==0)
			{
				del++;
			}
		}
		return del;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int t;
		t=s.nextInt();
		for(int i=0;i<t;i++)
		{
			String s4;
			s4=s.next();
			if(s4.length()%2!=0)
			{
				System.out.println("-1");
			}
			else
			{
			char[] s1=new char[s4.length()/2];
			char[] s2=new char[s4.length()/2];
			for(int j=0;j<s4.length()/2;j++)
			{
				s1[j]=s4.charAt(j);
			}
			for(int j=s4.length()/2;j<s4.length();j++)
			{
				s2[j-s4.length()/2]=s4.charAt(j);
			}
			//System.out.println(s1);
		    //System.out.println(s2);
			String first=new String(s1);
			String second=new String(s2);
			int del=deletions(first,second);
			System.out.println(del);
			}
			
			
			
		}

	}

}
