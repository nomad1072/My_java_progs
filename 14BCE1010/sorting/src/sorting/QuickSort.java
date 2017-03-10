package sorting;
import java.util.*;
public class QuickSort {
	static int counter1=0;
	static void quicksort(int a[],int p,int r)
	{
		if(p<r)
		{
			
			int q=partition(a,p,r);
			quicksort(a,p,q-1);
			
			quicksort(a,q+1,r);
		}
	}
	static int partition(int a[],int p,int r)
	{
		int x=a[r];int temp;
		int i=p-1;
		for(int j=p;j<=r-1;j++)
		{
			if(a[j]<=x)
			{
				i++;
			
			temp=a[j];
			a[j]=a[i];
			a[i]=temp;
			counter1++;
			}
			
		}
		temp=a[r];
		a[r]=a[i+1];
		a[i+1]=temp;
		counter1++;
		printArray(a);
		return i+1;
	}
	
	
	static void printArray(int[] ar) {
        for(int n: ar){
           System.out.print(n+" ");
        }
          System.out.println("");
     }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int[] a=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=s.nextInt();
		}
		quicksort(a,0,n-1);
		System.out.println(counter1);
		

	}

}
