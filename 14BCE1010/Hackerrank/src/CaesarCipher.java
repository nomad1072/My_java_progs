import java.util.*;
public class CaesarCipher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n;
		String s1=new String();
		String s2=new String();
		s1=s.nextLine();
		int k=s.nextInt();
		for(int i=0;i<s1.length();i++)
		{
			char m=s1.charAt(i);
			if((m>=65 && m<=90) || (m>=97 && m<=122))
			{
				s2=(String)(s1+k);
			}
			else
			{
			s2=s1;
			}
		}
		System.out.println(s2);

	}

}
