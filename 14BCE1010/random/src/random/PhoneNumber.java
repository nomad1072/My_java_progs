package random;
import java.util.*;
import java.util.Comparator;
public class PhoneNumber {
   private int phone;
   
  
   @Override
public String toString() {
	return "PhoneNumber [phone=" + phone + "]";
}

 PhoneNumber(int number) {
	   this.phone = number;
   }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("\n Enter n:");
		int n = s.nextInt();
		int number;
		PhoneNumber[] p = new PhoneNumber[n];
		for(int i = 0; i < n; i++) {
			System.out.println("\n Enter phone number:\n");
			number = s.nextInt();
			p[i] = new PhoneNumber(number);
		}

	   
		
		System.out.println("Numbers are:" + Arrays.toString(p));
		 Comparator c1 = new Comparator<PhoneNumber>() {

			@Override
			public int compare(PhoneNumber o1, PhoneNumber o2) {
				// TODO Auto-generated method stub
				// custom logic #1
				if(o1.phone < o2.phone) {
					return 1;
				}
				else {
					return -1;
				}
				
			}
			
		};
		Arrays.sort(p,c1);
		System.out.println(Arrays.toString(p));
		

	}
    
		

	public static Comparator c2 = new Comparator<PhoneNumber>() {
		
		@Override
		public int compare(PhoneNumber o1, PhoneNumber o2) {
			// TODO Auto-generated method stub
			// custom logic #1
			return 0;
		}
		
	};
	
	/*	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		PhoneNumber p = (PhoneNumber)o;
		if(this.phone < p.phone) {
			
			return 1;
		}
		else {
			
			return -1;
		}
	}
*/
/*	@Override
	public int compareTo(PhoneNumber p) {
		// TODO Auto-generated method stub
        PhoneNumber p1 = (PhoneNumber)p;
        if(this.phone < p1.phone) {
        	return p1.phone;
        }
        else {
        	return this.phone;
        }
	}
*/
	
	

}
