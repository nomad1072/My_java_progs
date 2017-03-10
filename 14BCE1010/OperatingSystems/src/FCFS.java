import java.util.*;
public class FCFS {
	Scanner s=new Scanner(System.in);
	int[] bt,bt1,at;
	int n;
	FCFS(int n) {
		this.n=n;
		bt=new int[n];
		bt1=new int[n];
		at=new int[n];
	}
	void input() {
		System.out.println("Enter burst times for each process ");
		for(int i=0;i<n;i++)
		{
			bt[i]=s.nextInt();
		}
		
	}
	void calcTime() {
		bt1[0]=bt[0];
		at[0]=0;
		for(int i=1;i<n;i++)
		{
			bt1[i]=bt[i]+bt1[i-1];
			at[i]=bt1[i-1];
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
		FCFS f=new FCFS(4);
		f.input();
		f.calcTime();
		f.display();

	}

}
