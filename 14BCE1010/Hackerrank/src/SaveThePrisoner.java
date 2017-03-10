import java.util.*;
public class SaveThePrisoner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while(t > 0) {
			int n = s.nextInt();
			int m = s.nextInt();
			int id = s.nextInt();
			int d = (id + m - 1) % n;
			if(d == 0) {
				System.out.println(n);
			}
			else {
				System.out.println(d);
			}
			t--;
		}

	}

}
