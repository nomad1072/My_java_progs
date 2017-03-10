import java.util.*;
public class UtopianTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int t,h=1;
		t=s.nextInt();
		int m;
		for(int i=0;i<t;i++)
		{
			m=s.nextInt();
			for(int j=1;j<=m;j++)
			{
				if(j%2==0)
				{
					h+=1;
				}
				else
				{
					h=h+h;
				}
			}
			System.out.print(h+"\n");
			h=1;
		}

	}

}
