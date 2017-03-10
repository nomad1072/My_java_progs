import java.util.*;
public class BeautifulTriplets1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub;
		int count = 0;
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int d = s.nextInt();
		Set<Integer> s1 = new TreeSet<Integer>();

		for(int i = 0; i < n; i++) {
			s1.add(s.nextInt());
		}
		for(int value:s1) {
			if(s1.contains(value - d) && s1.contains(value + d)) {
				count++;
			}
		}
		System.out.println(count);
		
		
    }
}
