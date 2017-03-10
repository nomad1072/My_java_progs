import java.io.IOException;
import java.util.*;
public class CavityMap1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n;
		n=s.nextInt();
		StringBuilder[] a=new StringBuilder[n];
		String[] a1=new String[n];
		for(int i=0;i<n;i++)
		{
			a1[i]=s.nextLine();
			a[i]=new StringBuilder(a1[i]);
		}
		 for(int i=0;i<n;i++)
		    {
		    	System.out.println(a1[i]);
		    }
		
	    for(int i=1;i<n-1;i++)
	    {
	    	for(int j=1;j<n-1;j++)
	    	{
	    	if((a1[i].charAt(j)>a1[i].charAt(j-1)) &&(a1[i].charAt(j)>a1[i].charAt(j+1)))
	    	{
	    	a[i].setCharAt(j,'X');
	    	}
	    }
	   }
	    
	    
	}

}
