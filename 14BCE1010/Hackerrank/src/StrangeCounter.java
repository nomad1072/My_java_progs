import java.util.*;
public class StrangeCounter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		List<Long> l = new ArrayList<Long>();
		long number = 3;
		long z = 3;
		for(long i = 0; i < 1000000000; i++) {
			l.add(z);
			z--;
			if(z == 1) {
				l.add(z);
				number = number*2;
				z = number;
			}
		}
       long n = s.nextLong();
       long m = l.get((int)n - 1);
       System.out.println(m);
   /*    for(int i = 0; i < 5; i++) {
    	   System.out.println((int)l.get(i));
       }*/
	}

}
