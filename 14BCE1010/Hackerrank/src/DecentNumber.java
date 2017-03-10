import java.util.*;
public class DecentNumber {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		long t,i;
		long q;
		t=s.nextLong();
		for(long m=0;m<t;m++)
		{
			q=s.nextInt();
			String s1 ="";
			for(i=q;i>=0;i--)
			{
				if(i%3==0 && (q-i)%5==0)
				{
					s1="";
					for(long k=0;k<i;k++)
					{
						s1+="5";
					}
					for(long k=0;k<q-i;k++)
					{
						s1+="3";
					}
					break;
				}
			}
			if(s1=="")
			{
				System.out.println("-1");
			}
			else 
			{
				System.out.println(s1);
			}
		}

	}

}
