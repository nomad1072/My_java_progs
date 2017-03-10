import java.util.*;
public class QuickSortInPlace {
	static int counter1=0;
	public static void quicksort(int a[],int l,int r)
	{
		 if(l<r)
		    {
		        int j,temp;
		        int pivot=a[l];
		        int i=l+1;
		        for(j=l+1;j<r;j++)
		        {
		            if(a[j]<pivot)
		            {
		                temp=a[i];
		                a[i]=a[j];
		                a[j]=temp;
		                i++;
		                counter1++;
		                
		            }
		        }
		        temp=a[i-1];
		        a[i-1]=a[l];
		        a[l]=temp;
		        counter1++;
		        quicksort(a,l,i-1);
		        
		        quicksort(a,i,r);
		        
		    }
		 display(a);

	}
	public static void display(int a[])
	{
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]);
		}
		System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=s.nextInt();
		}
		quicksort(a,0,n);
		display(a);
		System.out.println(counter1);

	}

}
