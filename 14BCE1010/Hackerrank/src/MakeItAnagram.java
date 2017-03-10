import java.util.*;
public class MakeItAnagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String s1,s2;
		s1=s.nextLine();
		s2=s.nextLine();
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
	/*	StringBuilder s4=new StringBuilder(s1);
		for(int i=0;i<s2.length();i++)
		{
			char ch=s2.charAt(i);
			int flag=1;
			
			for(int j=0;j<s1.length();j++)
			{
				if(ch!=s4.charAt(j))
				{
					flag=0;
				}
				else
				{
					flag=1;
					s4.setCharAt(j,'0');
					break;
				}
			}
			if(flag==0)
			{
				del++;
			}
			
		}*/
		System.out.println(del);

	}

}
