import java.util.*;
public class JumpingOnTheCloud {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int count = 0;
		int n = s.nextInt();
		int[] a = new int[n];
		for(int i = 0; i < n; i++) {
			a[i] = s.nextInt();
		}
		int i = 0;
		while(i < n-2) {
			
			if(a[i+1] == 0 && a[i+2] == 0) {
				i = i+2;
				count++;
			}
			else if(a[i+1] == 0 && a[i+2] == 1) {
				i = i+1;
				count++;
			}
			else {
				
				i = i+2;
				count++;
				
				
			}
		//	System.out.println(i);
		}
	
		System.out.println(count);

	}

}
