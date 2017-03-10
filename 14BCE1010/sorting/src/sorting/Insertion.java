package sorting;
import java.util.*;

public class Insertion {
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
		 Scanner s=new Scanner(System.in);
		 int n;
		 n=s.nextInt();
		 int[] a=new int[n];
		 for(int i=0;i<n;i++)
		 {
			 a[i]=s.nextInt();
		 }
		 for(int i=1;i<n;i++)
		 {
			 int j=i-1;
			 int t=a[i];
			 while(j>=0 && t<a[j])
			 {
				 a[j+1]=a[j];
				 j--;
			 }
			 a[j+1]=t;
			 display(a);
			 
		 }
		 display(a);
          
	}

}
