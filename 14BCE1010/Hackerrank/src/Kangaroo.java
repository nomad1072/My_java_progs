import java.util.*;
public class Kangaroo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int x1 = s.nextInt();
		int v1 = s.nextInt();
		int x2 = s.nextInt();
		int v2 = s.nextInt();
		int t;
		if(v1 == v2) {
			System.out.println("NO");
			System.exit(1);
		}
		t = (x1 - x2)/(v2 - v1);
		if(t < 0) {
			System.out.println("NO");
		}
		else if(v2 < v1 && (x1 - x2)%(v2 - v1) == 0) {
			System.out.println("YES");
		}
		else {
			System.out.println("NO");
		}

	}

}
