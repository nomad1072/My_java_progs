import java.util.*;
public class tutorialChallenge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int number=0;
		number=s.nextInt();
		int size;
		size=s.nextInt();
		int[] a=new int[size];
		for(int i=0;i<a.length;i++)
		{
			a[i]=s.nextInt();
		}
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==number)
			{
				System.out.println(i);
			}
		}

	}

}
