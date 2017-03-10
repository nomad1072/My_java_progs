package random;
import java.util.HashSet;
import java.util.*;
public class Permutations {
	public static HashSet<String> getAllPermutations(String s)
	{
		HashSet<String> permutations=new HashSet<String>();
		if(s==null || s.length()==0)
		{
			permutations.add("");
			return permutations;
		}
		char first=s.charAt(0);
		String rem=s.substring(1);
		HashSet<String> words=getAllPermutations(rem);
		for(String word:words)
		{
			for(int i=0;i<=word.length();i++)
			{
				String prefix=word.substring(0,i);
				String suffix=word.substring(i);
				permutations.add(prefix+first+suffix);
			}
		}
		return permutations;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String s1="aaaabbbbbccccccc";
		
		HashSet<String> permutations=getAllPermutations(s1);
		System.out.println(permutations);
		

	}

}
