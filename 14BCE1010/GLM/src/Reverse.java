import java.util.*;
public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		String s1 = s.nextLine();
		String s2 = "";
		for(int i = 0;i < s1.length(); i++) {
			s2 += s1.charAt(s1.length() - i - 1);
		}
		System.out.println("Reversed string is:" + s2);

	}

}
