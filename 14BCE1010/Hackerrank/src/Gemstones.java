import java.util.*;
public class Gemstones {
	
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		int n;
		n=s.nextInt();
		int[] a=new int[26];
		
		for(int i=0;i<n;i++)
		{
		String s2;
		s2=s.nextLine();
		char b[]=s2.toCharArray();
	
        for(int j=0;j<b.length;j++)
			{
        	if(a[b[j]-'a']==i)
        	{
				
				a[b[j]-'a']++;
			}
		}
		}
		int count=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==n)
			{
				count++;
			}
		}
		System.out.println(count);
	   
	}

}
