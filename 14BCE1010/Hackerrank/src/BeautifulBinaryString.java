import java.util.*;
public class BeautifulBinaryString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = 0;
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		String b;
		b = s.next();
		char[] m = b.toCharArray();
		char[] l = "010".toCharArray();
		for(int i = 0; i <= m.length - l.length; i++) {
			int j;
			for(j = 0; j < l.length; j++) {
				if(m[i+j] != l[j]) {
					break;
				}
				
			}
			if(j == l.length) {
				if(m[i+j -1] == 0) {
					m[i+j - 1] = 1;
				}
				else {
					m[i + j  - 1] = 0;
				}
			count++;
			}
			
		}
		System.out.println(count);
	//	System.out.println(m);
		

	}

}
