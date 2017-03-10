import java.util.Scanner;
public class Pangrams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		char[] small=new char[26];
		char[] big=new char[26];
		
		String s3;
		s3=s.nextLine();
		for(int i=0;i<s3.length();i++)
		{
			if(s3.charAt(i)>='A' && s3.charAt(i)<='Z')
			{
				small[s3.charAt(i)-'A']=1;
			}
			else if(s3.charAt(i)>='a' && s3.charAt(i)<='z')
			{
				big[s3.charAt(i)-'a']=1;
			}
		}
		for(int i=0;i<26;i++)
		{
			if(!(small[i]==1 || big[i]==1))
			{
				System.out.println("not pangram");
				System.exit(1);
			}
		}
		System.out.println("pangram");
		
		
		

	}

}
