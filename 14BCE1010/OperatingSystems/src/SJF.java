import java.util.*;
public class SJF {
    Scanner s=new Scanner(System.in);
    int[] a,bt,at;
    int n;
    SJF(int n) {
    	this.n=n;
    	a=new int[n];
    	bt=new int[n];
    	at=new int[n];
    }
    void input() {
    	System.out.println("Enter the burst times for each process");
    	for(int i=0;i<n;i++)
    	{
    		a[i]=s.nextInt();
    	}
    }
   
    void calcTime() {
    	Arrays.sort(a);
    	bt[0]=a[0];
    	at[0]=0;
    	for(int i=1;i<n;i++)
    	{
    		bt[i]=bt[i-1]+a[i];
    		at[i]=bt[i-1];
    	}
    }
    void display() {
		System.out.println("BURST TIME:");
		for(int i=0;i<n;i++)
		{
			System.out.print(bt[i]+" ");
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
		SJF s=new SJF(4);
		s.input();
		s.calcTime();
		s.display();

	}

}
