import java.util.*;
public class CountingValleys {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		String s1 = new String();
		int count = 0;
		int valleys = 0;
		s1 = s.nextLine();
		StringBuilder s2 = new StringBuilder(s1);
		for(int i = 0; i < s2.length(); i++) {
			if(s2.charAt(i) == 'U') {
				count++;
			}
			else {
				count--;
			}
			if(count == 0 && i != 0) {
				if(s2.charAt(i-1) == 'D') {
					valleys++;
				}
			}
		}
		System.out.println(valleys);

	}

}
