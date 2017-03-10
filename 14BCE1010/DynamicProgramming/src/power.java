import java.util.*;
public class power {

	public static int power(int x,int y)
	{
		if(y==0)
		{
			return 1;
		}
		else
		{
			return x*power(x,y-1);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int x,y;
		x=s.nextInt();
		y=s.nextInt();
		System.out.println(power(x,y));

	}

}
