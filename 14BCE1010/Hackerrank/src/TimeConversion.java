import java.util.*;
import java.sql.Time;
import java.text.*;
public class TimeConversion {
	public static void main(String args[]) 
	{
		SimpleDateFormat d=new SimpleDateFormat("hh:mm:ssa");
		SimpleDateFormat d1=new SimpleDateFormat("HH:mm:ss");
		Date date=null;
		Scanner s=new Scanner(System.in);
		String a;
		a=s.next();
		try
		{
			date=d.parse(a);
		}catch(ParseException e)
		{
			e.printStackTrace();
		}
		String formattedTime=d1.format(date);
		System.out.println(formattedTime);
		
		
		
		
	    
		
	}

}
