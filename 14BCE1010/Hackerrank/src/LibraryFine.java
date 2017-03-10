import java.text.SimpleDateFormat;
import java.util.*;
public class LibraryFine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
	    int d,m,y;
	    int d1,m1,y1;
	    int hackos;
	    d=s.nextInt();
	    m=s.nextInt();
	    y=s.nextInt();
	    d1=s.nextInt();
	    m1=s.nextInt();
	    y1=s.nextInt();
	    if(d-d1>0 && (m-m1)==0)
	    {
	    hackos=15*(d-d1);	
	    }
	    else if(m-m1>0 && (y-y1)==0) 
	    {
	    	hackos=500*(m-m1);
	    }
	    else if(y-y1>0)
	    {
	    	hackos=10000;
	    }
	    else
	    {
	    	hackos=0;
	    }
	    System.out.println(hackos);
	    
		
		

	}

}
