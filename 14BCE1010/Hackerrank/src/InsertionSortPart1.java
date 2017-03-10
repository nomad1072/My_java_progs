import java.util.*;
public class InsertionSortPart1 {

    public static void insertIntoSorted(int[] ar) {
        // Fill up this function
    	int e=0;
    	for(int i=0;i<ar.length;i++)
		{
			if(i==ar.length-1)
			{
			   e=ar[i];
			}
		}
		//System.out.print(e);
		int j=ar.length-1;
		while(j>0)
		{
			if(e<=ar[j-1])
			{
				ar[j]=ar[j-1];
				printArray(ar);
				j--;
			}
			else
			{
			        ar[j]=e;
					printArray(ar);
					break;
				
			}
				
			}
		/*	if(e>a[j])
			{
				a[j]=e;
				display(a);
				break;
				
			}
			else
			{
				if(j==0)
				{
					a[j]=e;
				}
				else
				{
				a[j]=a[j-1];
				}
			}*/
		if(j==0)
		{
			ar[j]=e;
			printArray(ar);
		}
			
			
 }
	

    
    
    
/* Tail starts here */
     public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int[] ar = new int[s];
         for(int i=0;i<s;i++){
            ar[i]=in.nextInt(); 
         }
         insertIntoSorted(ar);
    }
    
    
    private static void printArray(int[] ar) {
      for(int n: ar){
         System.out.print(n+" ");
      }
        System.out.println("");
   }
    
}
