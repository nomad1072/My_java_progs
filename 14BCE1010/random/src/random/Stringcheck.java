package random;
import java.util.*;
public class Stringcheck {
   static String compress(String s1)
   {
	   int counter=0;int k=0;int i=0;
	   String s2=new String("");
	  
	   
	   while(i<s1.length())
	   {
		   counter=0;
		   for(int j=i;j<s1.length();j++)
		   {
			   if(s1.charAt(i)==s1.charAt(j))
			   {
				   counter++;
			   }
		   }
		   s2+=s1.charAt(i);
		  
		   i+=counter;
		   if(counter>1)
		   {
			   s2+=Integer.toString(counter);
			   
		   }
	   }
	   
	   return s2;
   }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String s1,s2;
		s1=s.nextLine();
		s2=compress(s1);
		System.out.println(s2);

	}

}
