package random;
import java.util.*;

public class PageRank {
	
    
    //static int a[][] = new int[m][m];
/*	public static int[][] input() {
		System.out.println("Enter the elements:");
		for(int i = 0; i < m; i++) {
			for(int j = 0; j < m; j++) {
				a[i][j] = s.nextInt();
			}
		}
		return a;
		
		
	}*/
	public static int rowsum(int a[][], int m) {
		int count = 0;
		for(int i = 0; i < a.length; i++) {
			if(i == m) {
			for(int j = 0; j < a.length; j++) {
				if(a[i][j] == 1) {
					count++;
				}
			}
		}
	}
		return count;
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number of nodes:");
		int n = s.nextInt();
		int a[][] = new int[n][n];
		System.out.println("Enter the elements:");
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				a[i][j] = s.nextInt();
			}
		}
		
		
	//	int a[][] = input();
		
		for(int i = 0; i < n; i++) {
			String s1 = "0.5 +";
			for(int k = 0; k < n; k++) {
				if(a[k][i] == 1) {
				int g = rowsum(a,k);
				s1 = s1.concat("0.5*pr(" +k+")/"+g);
				System.out.println(s1);
				}
			}
		}
	

	}

}
