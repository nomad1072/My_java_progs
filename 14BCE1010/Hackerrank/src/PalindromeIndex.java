import java.util.*;
public class PalindromeIndex {
   public static boolean checkPalindrome(String s)
   {
	  String s1=new String();
	  for(int i=0;i<s.length();i++)
	  {
		  s1=s1+s.charAt(s.length()-i-1);
	  }
	//  System.out.println(s1+" "+s);
	  if(s1.equals(s))
	  {
		  return true;
	  }
	  else
	  {
		  return false;
	  }
	  
   }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s=new Scanner(System.in);
		int n;
		n=s.nextInt();
		for(int i=0;i<n;i++)
		{
			String s1=new String();
			s1=s.next();
			System.out.println(s1.length());
			if(checkPalindrome(s1)==true)
			{
				System.out.println(-1);
			}
			else
			{
			int index=0;
			if((s1.charAt(0)-s1.charAt(s1.length()-1))!=0)
			{
				String s5=s1.substring(1,s1.length());
				String s6=s1.substring(0,s1.length()-1);
				boolean z=checkPalindrome(s5);
				boolean z1=checkPalindrome(s6);
				if(z==true)
				{
					index=0;
					System.out.println(index+"          "+index);
				}
				if(z1==true)
				{
					index=s1.length()-1;
					System.out.println(index+"        "+index);
				}
				
				
			}
			else
			{
			int j=0;int k=s1.length()-1;
			while(++j<--k && Math.abs(s1.charAt(k)-s1.charAt(j))!=0)
			{
				
				    String s3=new String();
				    s3=s1.substring(0,j)+s1.substring(j+1,s1.length());
					String s4=new String();
				    s4=s1.substring(0,k)+s1.substring(k+1,s1.length());
					System.out.println(s3+" "+s4+" "+s1);
					boolean z=checkPalindrome(s3);
					boolean z1=checkPalindrome(s4);
					if(z==true)
					{
						index=j;
						
					//	System.out.println("balh"+index);
					
					}
					if(z1==true)
					{
						
						index=k;
						
						
					}
				
						
			}
			System.out.println(index);
			}
		}
			
		}

	}

}
