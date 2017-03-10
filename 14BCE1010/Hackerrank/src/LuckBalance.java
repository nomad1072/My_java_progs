import java.util.*;
public class LuckBalance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int li = s.nextInt();
		int luckBalance = 0;
		int k = s.nextInt();
		int[] luck = new int[li];
		List<Integer> imp = new ArrayList<Integer>();
		int[] ti = new int[li];
		for(int i = 0; i < luck.length; i++) {
			luck[i] = s.nextInt();
			ti[i] = s.nextInt();
			luckBalance += luck[i];
			if(ti[i] == 1) {
				imp.add(luck[i]);
			}
			
		}
		Collections.sort(imp);
		int balance = 0;
		int size = imp.size() - k;
		for(int i = 0; i < size; i++) {
			balance += imp.get(i);
		}
		luckBalance -= 2*balance;
		System.out.println(luckBalance);

	}

}
