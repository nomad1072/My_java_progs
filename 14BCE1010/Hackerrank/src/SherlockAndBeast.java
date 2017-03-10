import java.util.*;
public class SherlockAndBeast {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		boolean flag=false;
		int t;
		t=s.nextInt();
		for(int i=0;i<t;i++)
		{
			int n,n3,n5;
			n=s.nextInt();
			n5=n/3;
			n3=n-(n5*3);
			while(n3>0 && n5>0 && n3%5!=0)
			{
				n5--;
				n3=n-(n5*3);
			}
			if(n3%5==0)
			{
				flag=true;
			}
			if(flag==false)
			{
				System.out.println("-1");
			}
			else
			{
				while(n5>0)
				{
					System.out.print("555");
					n5--;
				}
				while(n3>0)
				{
					System.out.print("3");
					n3--;
				}
				System.out.println();
			}
			
			
			
		}

	}

}
