import java.util.*;
public class QuickSortPartition {
	private static Scanner s;
    static int counter1=0;
	static void quicksort(int a[],int p,int r)
	{
		
		if(p<r)
		{
			counter1++;
			int q=partition(a,p,r);
			quicksort(a,p,q);
			quicksort(a,q+1,r);
		}
		
	}
	static int partition(int a[],int l,int r)
	{
		 int pivot,i = 0,j,temp;
		    if(l<r)
		    {
		    pivot=a[l];
		    i=l+1;
		    for(j=l+1;j<=r;j++)
		    {
		        if(a[j]<=pivot)
		        {
		            temp=a[j];
		            a[j]=a[i];
		            a[i]=temp;
		            i++;
		        }
		    }
		    temp=a[l];
		    a[l]=a[i-1];
		    a[i-1]=temp;
		    
		    }
		    if(a.length!=1)
		    {
		    for(int i1=0;i1<i-1;i1++)
		    {
		    	System.out.print(a[i1]+" ");
		    }
		    System.out.println();
		    for(int i1=i;i1<r;i1++)
		    {
		    	System.out.print(a[i1]+" ");
		    }
		    System.out.println();
		    }
		    return i-1;
		
	}
	static void printArray(int[] ar) {
        for(int n: ar){
           System.out.print(n+" ");
        }
          System.out.println("");
     }

	public static void main(String[] args) {
		s = new Scanner(System.in);
		int n;
		n=s.nextInt();
		int[] a=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=s.nextInt();
		}
		quicksort(a,0,n-1);
		printArray(a);
		System.out.println(counter1);
		

	}

}
