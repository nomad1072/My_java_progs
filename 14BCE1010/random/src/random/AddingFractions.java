package random;
import java.util.*;
public class AddingFractions {
  static int gcd(int x,int y)
  {
	  while(x!=y)
	  {
	  if(x>y)
		  x=x-y;
	  else
		  y=y-x;
	  }
	  return x;
  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String s1;int k=0;int i=0;int j=0;
		s1=s.nextLine();
		int[] a=new int[4];
	/*	while(i<s1.length()&&s1.charAt(i)!='+')
		{
			while(j<s1.length()&&s1.charAt(j)!='+')
			{
				if(s1.charAt(j)=='/')
				{
					a[k]=Integer.parseInt(s1.substring(i,j));
					break;
				}
				j++;
			}
			i=i=j;
			
		}
		for(int m=0;m<a.length;m++)
		{
			System.out.println(a[m]);
		}*/
		int m=0;
		for(m=0;m<s1.length();m++)
		{
			if(s1.charAt(m)=='+')
			{
				break;
			}
		}
		char[] myName=s1.toCharArray();
		myName[m]='/';
		s1=String.valueOf(myName);
		String[] parts=s1.split("/");
	//	System.out.println(parts[3].trim());
		int x,y,u,v;
		x=Integer.valueOf(parts[0]);
		y=Integer.valueOf(parts[1]);
		u=Integer.valueOf(parts[2]);
		v=Integer.valueOf(parts[3]);
		//System.out.println(x);
		
		while(gcd(x,y)!=1)
		{
			int z=gcd(x,y);
			x=x/z;
			y=y/z;
		}
		while(gcd(u,v)!=1)
		{
			int z=gcd(u,v);
			u=u/z;
			v=v/z;
		}
		int numerator=((x*v)+(u*y));
		int denominator=(y*v);
		while(gcd(numerator,denominator)!=1)
		{
			int z=gcd(numerator,denominator);
			numerator=numerator/z;
			denominator=denominator/z;
		}
		String[] result=new String[100];
		result[k]=numerator+"/"+denominator;
		System.out.println(result[k]);
	//	System.out.println(u+" "+v);
		

	}

}
