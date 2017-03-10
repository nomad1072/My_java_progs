import java.util.*;
public class StringPrint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
        String a;
        String a2=" ";
        a=s.nextLine();
        a=a.replaceAll("\\s","");
        int l=a.length();
        int r = 0,c = 0;
        int nr=(int)Math.floor(Math.sqrt(l));
        int nc=(int)Math.ceil(Math.sqrt(l));
        int m=0;
        String a1=a.substring(l-1,l);
        int area=nr*nc;
        if(!(nr*nc>=l))
        {
        	nr++;
        	
        	
        }
        int[][] matrix=new int[nr][nc];
        
       
        for(int i=0;i<nr;i++)
        {
        	for(int j=0;j<nc;j++)
        	{
        		
        		if(m<l)
        		{
        		matrix[i][j]=a.charAt(m);
        		m++;
        		}
        		if(m==l)
        		{
        			matrix[i][j]=a1.charAt(0);
        			m++;
        		}
        		
        		
        	}
        }
        for(int j=0;j<nc;j++)
        {
        	for(int i=0;i<nr;i++)
        	{
        		char c1=(char)matrix[i][j];
        		System.out.print(c1);
        	}
        	System.out.print("\t");
        }
       
        
        
        
		

	}

}
