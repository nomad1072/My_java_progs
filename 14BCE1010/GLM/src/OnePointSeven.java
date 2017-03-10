import java.util.*;
public class OnePointSeven {
	
/*	public static void remove(int i,int j,int[][] a,int m,int n)
	{
		for(int k=0;k<m;k++)
		{
			a[k][j] = 0;
		}
		for(int k=0;k<n;k++)
		{
			a[i][k] = 0;
		}
	}
*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("\n Enter number of rows and columns:");
		int m = s.nextInt();
		int n = s.nextInt();
		int[][] a = new int[m][n];
	//	int[][] b = new int[m][n];
		int[] b = new int[a.length];
	//	System.out.println(b.length);
		int[] c = new int[a[0].length];
	//	System.out.println(c.length);
		for(int i = 0; i < m; i++) {
			for(int j=0; j<n; j++) {
				a[i][j] = s.nextInt();
			}
		}
		for(int i = 0; i < m; i++) {
			
			for(int j = 0; j < n; j++) {
				
				if(a[i][j] == 0) {
					
					b[i] = 1;
					c[j] = 1;
					
				}
			}
		}
		
		for(int i = 0; i < m; i++) {
			
			for(int j = 0; j < n; j++) {
				
				if(b[i] == 1 || c[j] == 1) {
					
					a[i][j] = 0;
				}
			}
			System.out.println();
		}
		System.out.println("The array is:");
		for(int i = 0; i < m; i++) {
			
			for(int j = 0 ; j < n; j++) {
				
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
		

	}

}
