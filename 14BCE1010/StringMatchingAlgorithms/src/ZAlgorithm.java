import java.util.ArrayList;
import java.util.List;

public class ZAlgorithm {
	public static int[] calculateZ(char n[])
	{
		int z[]=new int[n.length];
		int left=0;
		int right=0;
		z[0]=0;
		for(int k=1;k<n.length;k++)
		{
			if(k>right)
			{
				left=right=k;
				while(right<n.length &&n[right]==n[right-left])
				{
					right++;
				}
				z[k]=right-left;
				right--;
			}
			else
			{
				int k1=k-left;
				if(z[k1]<right-k+1)
				{
					z[k]=z[k1];
				}
				else
				{
					left=k;
					while(right<n.length && n[right]==n[right-left])
					{
						right++;
					}
					z[k]=right-left;
					right--;
				}
			}
		}
		return z;
	}
	public static List<Integer> matchPattern(char text[],char pattern[])
	{
		char n[]=new char[text.length+pattern.length+1];
		int i=0;
		for(char ch:pattern)
		{
			n[i]=ch;
			i++;
		}
		n[i]='$';
		i++;
		for(char ch:text) {
			n[i]=ch;
			i++;
		}
		List<Integer> result=new ArrayList<>();
		int z[]=calculateZ(n);
		for(int k=0;k<z.length;k++)
		{
			if(z[k]==pattern.length)
			{
				result.add(k-pattern.length);
			}
		}
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text="aaabcxyzaaabc";
		String pattern="aaabc";
		List<Integer> result=matchPattern(text.toCharArray(),pattern.toCharArray());
		System.out.print("Pattern found at:");
		System.out.println(result);

	}

}
