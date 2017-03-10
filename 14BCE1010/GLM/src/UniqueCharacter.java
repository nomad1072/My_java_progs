import java.util.*;
public class UniqueCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int flag = 1;
		Scanner s = new Scanner(System.in);
		String s1 = s.nextLine();
		int[] b = new int[26];
		char[] c = s1.toCharArray();
		for(int i = 0; i < c.length; i++) {
			b[c[i] - 'a']++;
		}
		for(int i = 0; i < b.length; i++) {
			if(b[i] == 1 || b[i] == 0)
			{
				flag = 1;
			}
			else
			{
				flag = 0;
				break;
			}
		}
		if(flag == 0)
		{
			System.out.println("Does not contain unique characters");
		}
		else
		{
			System.out.println("Contains unique characters");
		}

	}

}
