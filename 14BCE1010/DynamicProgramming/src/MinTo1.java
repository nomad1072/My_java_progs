import java.util.*;
public class MinTo1 {

	static int minimum(int a,int b)
	{
		if(a<b)
			return a;
		else
			return b;
	}
 static int Minimum(int n)
 {
	 int[] dp=new int[n+1];
	 dp[1]=0;
	 for(int i=2;i<=n;i++)
	 {
		 dp[i]=1+dp[i-1];
		 if(i%2==0)
		 {
			 dp[i]=minimum(dp[i],1+dp[i/2]);
		 }
		 if(i%3==0)
		 {
			 dp[i]=minimum(dp[i],1+dp[i/3]);
		 }
	 }
	 return dp[n];
	 
 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
       int n=s.nextInt();
       System.out.println(Minimum(n));
	}

}
