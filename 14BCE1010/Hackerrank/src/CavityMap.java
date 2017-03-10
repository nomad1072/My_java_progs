import java.util.*;
public class CavityMap {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
        int n;
        
        n=s.nextInt();
               
        int[][] a=new int[n][n];
        for(int i=0;i<n;i++)
        {
        	for(int j=0;j<n;j++)
        	{
        		a[i][j]=s.nextInt();
        	}
        }
        for(int i=0;i<n;i++)
        {
        	for(int j=0;j<n;j++)
        	{
        		if(a[i][j]!=a[0][0] && a[i][j]!=a[0][n-1] && a[i][j]!=a[n-1][0]&& a[i][j]!=a[n-1][n-1])
        		{
        			if(a[i][j-1]<a[i][j] && a[i][j+1]<a[i][j])
        			{
        				System.out.print("X");
        			}
        			else
            		{
            			System.out.print(a[i][j]);
            		}
        		}
        		else
        		{
        			System.out.print(a[i][j]);
        		}
        	}
        	System.out.println("\n");
        }
	}

}
