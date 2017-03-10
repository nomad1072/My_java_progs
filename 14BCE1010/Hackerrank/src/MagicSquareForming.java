import java.util.*;
public class MagicSquareForming {

	public static int rowSum(int i, int[][] a) {
		int sum = 0;
		for(int j = 0; j < 3; j++) {
			sum += a[i][j];
		}
		return sum;
	}
	public static int columnSum(int j, int[][] a) {
		int sum = 0;
		for(int i = 0; i < 3; i++) {
			sum += a[i][j];
		}
		return sum;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int count = 0;
		int[][] a = new int[3][3];
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				a[i][j] = s.nextInt();
			}
		}
		for(int i = 0; i < 3; i++) {
			int b = rowSum(i,a);
			for(int j = 0; j < 3; j++) {
				int c = columnSum(j,a);
				if(b != 15 && c != 15) {
					a[i][j] += 15 - b;
					count++;
				}
			}
		}
		System.out.println(count);

	}

}
