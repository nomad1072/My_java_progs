import java.util.*;
public class CamelCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int count = 1;
		String s1 = new String();
		s1 = s.nextLine();
		char[] a = new char[s1.length()];
		a = s1.toCharArray();
		for(int i = 0; i < a.length ; i++) {
			if(a[i] >= 65 && a[i] <= 90) {
				count++;
			}
		}
		System.out.println(count);

	}

}
