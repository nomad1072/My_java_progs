import java.util.*;
public class InsertionSort {
    static int counter=0;
	 public static void insertIntoSorted(int[] ar) {
	        // Fill up this function
		 int e = 0;int i1,j;
	        for(int i=0;i<ar.length;i++)
	        {
	           if(i==ar.length-1)
	           {
	        	   e=ar[i];
	           }
	        }
	       for(i1=1;i1<ar.length;i1++)
	       {
	    	   int t=ar[i1];
	    	   j=i1-1;
	    	   while( j>=0 && t<ar[j] )
	    	   {
	    		   ar[j+1]=ar[j];
	    		   j=j-1;
	    		   counter++;
	    	   }
	    	   ar[j+1]=t;
	    	   printArray(ar);
	    	   
	       }
	      
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner in = new Scanner(System.in);
	        int s = in.nextInt();
	        int[] ar = new int[s];
	         for(int i=0;i<s;i++){
	            ar[i]=in.nextInt(); 
	         }
	         insertIntoSorted(ar);
	         System.out.println(counter);

	}
	private static void printArray(int[] ar) {
	      for(int n: ar){
	         System.out.print(n+" ");
	      }
	        System.out.println("");
	   }

}
