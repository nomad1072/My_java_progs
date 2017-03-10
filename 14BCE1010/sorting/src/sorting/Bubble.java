package sorting;

import java.util.Scanner;

public class Bubble {
	Scanner s=new Scanner(System.in);
	int temp;
	int[] a;
	void input(int size)
	{
		a=new int[size];
		System.out.println("\n Enter the elements");
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
				if(a[j]<a[j-1])
				{
					temp=a[j];
					a[j]=a[j-1];
					a[j-1]=temp;
				}
			}
		}
	}
	void display()
	{
		System.out.println("\n The elements are:\n");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+"\t");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bubble b=new Bubble();
		b.input(5);
		b.sort();
		b.display();

	}

}
