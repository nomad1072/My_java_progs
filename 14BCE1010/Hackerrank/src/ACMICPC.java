import java.math.BigInteger;
import java.util.*;
public class ACMICPC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n,m;
		int counter;
		n=s.nextInt();
		m=s.nextInt();
		BigInteger score; 
		int[][] a=new int[n][m];
		for(int i=0;i<n;i++)
		{
			int[] array=new int[m];
			String topic=s.nextLine();
			for(int j=0;j<topic.length();j++)
			{
				array[j]=Integer.parseInt(topic.charAt(j)+"");
			}
			a[i]=array;
		}
		int highest=-1;
		int bestTeams=0;
		for(int i=0;i<a.length-1;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				int know=0;
				for(int x=0;x<m;x++)
				{
					 know += (a[i][x] == 1 || a[j][x] == 1) ? 1 : 0;
					
				}
				if(know > highest){
                    highest = know;
                    bestTeams=1;
                }
                else if(know == highest){
                    bestTeams++;
                }
                
            }
        }
        System.out.println(highest);
        System.out.println(bestTeams);
				
}
		

	}


