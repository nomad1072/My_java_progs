import java.util.*;
public class LoveLetterMystery {
  public static boolean checkPalindrome(StringBuffer s)
    {
	  StringBuffer s1=new StringBuffer(s);
	  s1.reverse();
	  /*System.out.println(s1);
	  System.out.println(s);*/
	  if(s==s1)
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
		Scanner s2=new Scanner(System.in);
		int n=s2.nextInt();
		for(int i=0;i<n;i++)
		{
			String s=new String();
			s=s2.nextLine();
			StringBuffer s1=new StringBuffer(s);
            System.out.println(s1);
			int j=0;int k=s1.length();int counter=0;
			while(!checkPalindrome(s1))
			{
				while(j<k && s1.charAt(j)!=s1.charAt(k))
				{
					int a=s1.charAt(k);
					a=a-1;
					char a1=(char)a;
					s1.setCharAt(k,a1);
					counter++;
					
				}
				j++;
				k--;
			}
			System.out.println(counter);
		}
		
	}

}
