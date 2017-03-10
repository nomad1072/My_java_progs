
package sorting;
import java.util.Scanner;

public class Selection {
	int temp;
	Scanner s=new Scanner(System.in);
	int[] a;
	void input(int size)
	{
		a=new int[size];
		System.out.println("\n ENter the elements to be sorted\n");
		for(int i=0;i<a.length;i++)
		{
			a[i]=s.nextInt();
		}
		
	}
	void sort()
	{
		for(int i=0;i<a.length;i++)
		{
			
			for(int j=i+1;j<a.length;j++)
			{
				if(a[j]<a[i])
				{
					temp=a[j];
					a[j]=a[i];
					a[i]=temp;
					
				}
			}
		}
	}
	void display()
	{
		System.out.println("\n The elements in sorted order are:\n");
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]+"\t");
		}
	}

	public static void main(String[] args) {
		Selection s1=new Selection();
		s1.input(5);
		s1.sort();
		s1.display();
	

	}

}
