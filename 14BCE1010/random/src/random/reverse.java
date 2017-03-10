package random;
import java.util.*;
public class reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String s1,s2="";
		s1=s.nextLine();
		System.out.println(s1.length());
		for(int i=0;i<s1.length();i++)
		{
			s2+=s1.charAt(s1.length()-i-1);
		}
		System.out.println(s2);

	}

}
