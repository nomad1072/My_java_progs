import java.util.*;
public class MarsExploration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int count = 0;
		String s1 = s.nextLine();
		String s2 = "SOS";
		String repeated = new String(new char[s1.length()/3]).replace("\0",s2);
		//System.out.println(repeated + repeated.length() + s1.length());
		for(int i = 0; i < repeated.length(); i++) {
			if(!(repeated.charAt(i) == s1.charAt(i))) {
				count++;
			}
		}
		System.out.println(count);
	}

}
