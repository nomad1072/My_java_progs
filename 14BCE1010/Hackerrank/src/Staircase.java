
import java.util.*;
 class Staircase {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int i=0;i<n;i++)
            {
            for(int j=0;j<=i;j++)
                {
                if(j==0)
                    {
                    for(int k=0;k<n-i-1;k++)
                        {
                        System.out.print(" ");
                    }
                }
                System.out.print("#");
            }
            System.out.println();
        }
    }
}
