import java.util.*;
public class RunningTimeOfQuickSort {
	 static int counter=0;
	 static int counter1=0;
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
	    	 
	    	   
	       }
	      
	    }
	 private static void printArray(int[] ar) {
	      for(int n: ar){
	         System.out.print(n+" ");
	      }
	        System.out.println("");
	   }
	 
		static void quicksort(int a[],int p,int r)
		{
			if(p<r)
			{
				
				int q=partition(a,p,r);
				quicksort(a,p,q-1);
				
				quicksort(a,q+1,r);
			}
		}
		static int partition(int a[],int p,int r)
		{
			int x=a[r];int temp;
			int i=p-1;
			for(int j=p;j<=r-1;j++)
			{
				if(a[j]<=x)
				{
					i++;
				
				temp=a[j];
				a[j]=a[i];
				a[i]=temp;
				counter1++;
				}
				
			}
			temp=a[r];
			a[r]=a[i+1];
			a[i+1]=temp;
			counter1++;
		
			return i+1;
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		   int s = in.nextInt();
	        int[] ar = new int[s];
	        int[] ar1 = new int[s];
	         for(int i=0;i<s;i++){
	            ar[i]=in.nextInt(); 
	         }
	         for(int i=0;i<s;i++){
		            ar1[i]=ar[i]; 
		         }
		         
	         
	         insertIntoSorted(ar);
	         quicksort(ar1,0,s-1);
	         int m=counter-counter1;
	        
	 		 System.out.println(m);
	         
		

	}

}
