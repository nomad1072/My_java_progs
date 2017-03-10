import java.util.*;
public class InsertionSortPart {
    public static void display(int a[])
    {
    	for(int i=0;i<a.length;i++)
    	{
    		System.out.print(a[i]+"\t");
    	}
    	System.out.println();
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int e=0;
		Scanner s=new Scanner(System.in);
		int n;
		n=s.nextInt();
		int[] a=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=s.nextInt();
		}
		for(int i=0;i<a.length;i++)
		{
			if(i==a.length-1)
			{
			   e=a[i];
			}
		}
		//System.out.print(e);
		int j=a.length-1;
		while(j>0)
		{
			if(e<=a[j-1])
			{
				a[j]=a[j-1];
				display(a);
				j--;
			}
			else
			{
			        a[j]=e;
					display(a);
					break;
				
			}
				
			}
		/*	if(e>a[j])
			{
				a[j]=e;
				display(a);
				break;
				
			}
			else
			{
				if(j==0)
				{
					a[j]=e;
				}
				else
				{
				a[j]=a[j-1];
				}
			}*/
		if(j==0)
		{
			a[j]=e;
			display(a);
		}
			
			
		}
	

	}


