import java.io.BufferedReader;
import java.io.Console;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class TwoStrings2 {
    public static String input() throws IOException
    {
    	BufferedReader console=new BufferedReader(new InputStreamReader(System.in));
    	String s1;
    	s1=console.readLine();
    	
    	return s1;
    }
  /*  public static void display(int[] a)
    {
    	for(int i=0;i<a.length;i++)
    	{
    		System.out.print(a[i]+" ");
    	}
    }*/
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n;
		n=s.nextInt();
		for(int i=0;i<n;i++)
		{
			int flag=0;
			
	    
		String s1=input();
		String s2=input();
		int[] a=new int[26];
		for(int k=0;k<s1.length();k++)
		{
			if(a[s1.charAt(k)-'a']!=0){}
			else
			{
			a[s1.charAt(k)-'a']++;
			}
		}
		
		int[] b=new int[26];
		for(int k=0;k<s2.length();k++)
		{
			if(b[s2.charAt(k)-'a']!=0){}
			else
			{
			b[s2.charAt(k)-'a']++;
			}
		}
	/*	for(int k=0;k<a.length;k++)
		{
			System.out.print(a[k]+" ");
		}
		display(a);System.out.println();
		display(b); */
		for(int k=0;k<a.length;k++)
		{
			if(a[k]!=0 && b[k]!=0)
			{
				if(a[k]==b[k])
				{
					flag=1;
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
