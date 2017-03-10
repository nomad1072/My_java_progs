import java.util.*;
public class SuperReducedString {
	
	public static String compress(String a) {
		int flag = 1;
		String c = new String("");
		String d = new String("Empty String");
		char b = a.charAt(0);
		int count = 0;
		for(int i = 0; i < a.length(); i++) {
			if(a.charAt(i) == b) {
				count++;
			}
			else {
				if(count % 2 != 0) {
					c += b;
				}
				b = a.charAt(i);
				count = 1;
			}
		}
		if(flag == 0) {
			return d;	
		}
		else {
			return c;
		}
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		String a = s.nextLine();
		String b = compress(a);
		System.out.println(b);
		

	}

}
