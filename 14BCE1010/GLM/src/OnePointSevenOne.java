import java.util.*;
public class OnePointSevenOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		HashMap<Integer,Integer> map = new HashMap();
		System.out.println("Enter number of rows and columns:\n");
		int m,n;
		m = s.nextInt();
		n = s.nextInt();
		int[][] a = new int[m][n];
		for(int i = 0; i < m; i++) {
			for(int j=0; j < n; j++) {
				a[i][j] = s.nextInt();
				if(a[i][j] == 0) {
					map.put(i,j);
				}
				
			}
		}
		for(int i:map.keySet()) {
		    int	value = map.get(i);
		    for(int j = 0; j < n; j++) {
		    	a[i][j] = 0;
		    }
		    for(int j = 0; j < m; j++) {
		    	a[j][value] = 0;
		    }
		
		}
		System.out.println("The array is:");
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}

	}

}
