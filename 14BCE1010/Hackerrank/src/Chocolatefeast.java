import java.util.*;
public class Chocolatefeast {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner s=new Scanner(System.in);
        long t;long m,c,n;
        long nc=0;long uc;
        t=s.nextInt();
        for(int i=0;i<t;i++)
        {
        	n=s.nextInt();
        	c=s.nextInt();
        	m=s.nextInt();
        	nc=(n/c);
        	
        	if((nc<m))
        	{
        		System.out.println(nc);
        	}
        	else
        	{
        		uc=nc;
        		//System.out.println(uc);
        		
        		while(uc>=2)
        		{
        			if(uc<m)
        			{
        				break;
        			}
        			
        			long nc1=uc;
        			nc+=nc1/m;
        			uc=uc%m;
        			uc+=(nc1/m);
        			//System.out.println(uc);
        		}
        		System.out.println(nc);
        	}
        	
        }
	}

}
