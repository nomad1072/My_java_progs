import java.util.*;
public class Sample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap h1 = new HashMap();
		HashMap h2 = new HashMap();
	//	
        String x = "abc";
        String y = new String("abc");
        String z = "abc";
      //  String z1 = "xyz";
        boolean status = ( x == y );
    	boolean status1 = (x.equals(y));
    	System.out.println(status);
    	System.out.println(status1);
    //System.out.println(x.hashCode());
    	boolean status2 = (x==z);

    	System.out.println(status2);
    	System.out.println(x.hashCode());
    	System.out.println(y.hashCode());
    	System.out.println(z.hashCode());
    //	System.out.println(z1.hashCode());
    	x.hashCode();
    	z.hashCode();
    	y.hashCode();
        
	}

}
