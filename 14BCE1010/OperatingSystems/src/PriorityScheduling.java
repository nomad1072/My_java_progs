import java.util.*;
public class PriorityScheduling {
	Scanner s=new Scanner(System.in);
	int n;
	int[] bt,bt1,at,pr;
	PriorityScheduling(int n) {
		this.n=n;
		bt=new int[n];
		bt1=new int[n];
		at=new int[n];
		pr=new int[n];
	}
	void input() {
		System.out.println("Enter the burst times and priority for each process");
		for(int i=0;i<n;i++)
		{
			bt[i]=s.nextInt();
			pr[i]=s.nextInt();
			
		}
		
		
		
	}
	void calcTime() {
		for(int i=0;i<n;i++)
		{
			int pos=i;
			for(int j=i+1;j<n;j++)
			{
				if(pr[j]<pr[pos])
				{
					pos=j;
				}
			}
			int temp=pr[i];
			pr[i]=pr[pos];
			pr[pos]=temp;
			
			temp=bt[i];
			bt[i]=bt[pos];
			bt[pos]=temp;
		}
		bt1[0]=bt[0];
		at[0]=0;
		
		for(int i=1;i<n;i++)
		{
			bt1[i]=bt[i]+bt1[i-1];
			at[i]=bt1[i-1];
		}
		System.out.println("BT1:");
		for(int i=0;i<n;i++)
		{
			System.out.println(bt1[i]+" ");
		}
		
	}
	void display() {
		System.out.println("BURST TIME:");
		for(int i=0;i<n;i++)
		{
			System.out.print(bt1[i]+" ");
		}
		System.out.println();
		System.out.println("ARRIVAL TIME:");
		for(int i=0;i<n;i++)
		{
			System.out.print(at[i]+" ");
		}

	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityScheduling p=new PriorityScheduling(5);
		p.input();
		p.calcTime();
		p.display();

	}

}
