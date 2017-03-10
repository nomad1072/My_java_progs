import java.util.*;
public class CavityMap2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
        int n;
        n=s.nextInt();
        String[] s1=new String[n];
        StringBuilder[] s2=new StringBuilder[n];
    //    int[][] a=new int[n][n];
        for(int i=0;i<n;i++)
		{
			s1[i]=s.next();
			s2[i]=new StringBuilder(s1[i]);
		}
       
      
        for(int i=1;i<n-1;i++)
        {
        	for(int j=1;j<n-1;j++)
        	{
        		if((s2[i].charAt(j)>s2[i].charAt(j-1)) &&(s2[i].charAt(j)>s2[i].charAt(j+1))&&(s2[i].charAt(j)>s2[i+1].charAt(j)) &&(s2[i].charAt(j)>s2[i-1].charAt(j)))
    	    	{
    	    	s2[i].setCharAt(j,'X');
    	    	}
        		
        	}
        }
        for(int i=0;i<n;i++)
        {
        	System.out.println(s2[i]);
        }
	}

}
