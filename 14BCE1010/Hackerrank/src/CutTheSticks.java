import java.util.*;
public class CutTheSticks {
	static boolean checkArray(int a[])
   {
	   int flag=1;
	   
	   for(int i=0;i<a.length;i++)
	   {
		   if(a[i]==0)
		   {
			   flag=0;
		   }
		   else
		   {
			   flag=1;
			   break;
		   }
	   }
	   if(flag==1)
	   {
		   return true;
	   }
	   else
	   {
		   return false;
	   }
   }
  
  static int smallest(int a[])
   {
	   int small=999;
	   for(int i=0;i<a.length;i++)
	   {
		   if(a[i]!=0)
		   {
			   if(a[i]<small)
			   {
			   small=a[i];
			   }
		   }
		   else
		   {
			   
		   }
		   
	   }
	   return small;
	   
   }
  static int cutSticks(int a[],int small)
   {
	   int counter=0;
	   for(int i=0;i<a.length;i++)
	   {
		   if(a[i]!=0)
		   {
		   
			   a[i]=a[i]-small;
			   counter++;
		   }
			   
		   
	   }
	   return counter;
   }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s=new Scanner(System.in);
		int n;boolean z=true;
		
		int small;
		
		n=s.nextInt();
		int[] a=new int[n];
		int counter=0;
		for(int i=0;i<a.length;i++)
		{
			a[i]=s.nextInt();
		}
	    while(checkArray(a))
		{
			small=smallest(a);
			counter=cutSticks(a,small);
	        System.out.println(counter);
		}
		
		
		
		
        
	}

}
