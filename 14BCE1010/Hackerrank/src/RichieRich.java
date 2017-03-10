import java.util.*;
public class RichieRich {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = 0;
		int flag = 0;
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int k = s.nextInt();
		String s1 = s.next();
		StringBuilder s2 = new StringBuilder(s1);
	//	System.out.println(a);
		for(int i = 0; i < (s2.length())/2; i++) {
			
			if((s2.charAt(i) != s2.charAt(s2.length()-i-1)) && (count <= k)) {
				
				if(s2.charAt(i) == 9) {
					s2.setCharAt(s2.length()-i-1,'9');
					System.out.println(s2);
					count++;
				}
				else{
					s2.setCharAt(i,'9');
					count++;
				}
				if(s2.charAt(i) != 9 && s2.charAt(s2.length()-i-1) != 9) {
					s2.setCharAt(s2.length()-i-1,'9');
					s2.setCharAt(i,'9');
					
					count += 2;

				}
				flag = 0;
				//System.out.println(a);
				
			}
			if(count > k) {
				flag = 1;
				break;
			}
			
		}
		
		if(flag == 1) {
			System.out.println(-1);
		}
		else {
		System.out.println(s2);
		}

	}

}
