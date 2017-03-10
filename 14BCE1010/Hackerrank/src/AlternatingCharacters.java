import java.util.*;
public class AlternatingCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String s2;
		int n;
		n=s.nextInt();
		for(int i=0;i<n;i++)
		{
			s2=s.next();
			int del=0;
			for(int j=1;j<s2.length();j++)
			{
				if(s2.charAt(j-1)=='A')
				{
					if(s2.charAt(j)=='A')
					{
						del++;
					}
					
				}
				else
				{
					if(s2.charAt(j-1)=='B')
					{
						if(s2.charAt(j)=='B')
						{
							del++;
						}
					}
				}
			}
			System.out.println(del);
		}
		

	}

}
