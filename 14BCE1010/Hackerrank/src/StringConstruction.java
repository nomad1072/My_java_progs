import java.util.*;
public class StringConstruction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		Set<Character> m = null;
		int n = s.nextInt();
		for(int i = 0; i < n; i++) {
			String s1 = s.nextLine();
			char[] c = s1.toCharArray();
			m = new HashSet<Character>();
			for(char j : c) {
				m.add(j);
			}
			System.out.println(m.size());
			
		}
	}
}
